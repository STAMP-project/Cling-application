import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markTypeNode(node15, (int) (byte) 10, (int) (short) 100, (int) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        java.lang.Class<?> wildcardClass11 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        java.lang.Class<?> wildcardClass13 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
        boolean boolean24 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.recordNoShadow();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        java.lang.Class<?> wildcardClass14 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
        boolean boolean24 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean6 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        java.lang.Class<?> wildcardClass9 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean7 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean10 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean8 = jSDocInfoBuilder1.hasParameter("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordVisibility(visibility10);
        boolean boolean13 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean13 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean13 = jSDocInfoBuilder1.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordExpose();
        boolean boolean13 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean7 = jSDocInfoBuilder1.addAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean12 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean7 = jSDocInfoBuilder1.isPopulated();
        java.lang.Class<?> wildcardClass8 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        boolean boolean27 = jSDocInfoBuilder1.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordDeprecated();
        java.lang.Class<?> wildcardClass9 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression19);
        boolean boolean21 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean5 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean7 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean11 = jSDocInfoBuilder1.addAuthor("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean17 = jSDocInfoBuilder1.recordExpose();
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean18 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean20 = jSDocInfoBuilder1.recordVersion("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean12 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        java.lang.Class<?> wildcardClass26 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression12);
        boolean boolean15 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordJavaDispatch();
        java.lang.Class<?> wildcardClass13 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        boolean boolean16 = jSDocInfoBuilder1.addAuthor("hi!");
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression14);
        jSDocInfoBuilder1.markAnnotation("hi!", 100, (int) '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        boolean boolean27 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression28);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean5 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean10 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean12 = jSDocInfoBuilder1.addReference("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression21);
        boolean boolean24 = jSDocInfoBuilder1.recordLends("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean15 = jSDocInfoBuilder1.addReference("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean8 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.recordNoShadow();
        java.lang.Class<?> wildcardClass12 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder27 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder27.recordEnumParameterType(jSTypeExpression28);
        boolean boolean30 = jSDocInfoBuilder27.isInterfaceRecorded();
        boolean boolean31 = jSDocInfoBuilder27.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder33 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean34 = jSDocInfoBuilder33.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        boolean boolean42 = jSDocInfoBuilder36.recordModifies((java.util.Set<java.lang.String>) strSet40);
        boolean boolean43 = jSDocInfoBuilder33.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean44 = jSDocInfoBuilder27.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean45 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean47 = jSDocInfoBuilder1.recordVersion("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        boolean boolean11 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean14 = jSDocInfoBuilder1.recordDescription("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean7 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean8 = jSDocInfoBuilder1.recordOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression9, "hi!");
        boolean boolean12 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean12 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.recordDeprecationReason("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean7 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markText("hi!", (int) ' ', (int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 32?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean12 = jSDocInfoBuilder1.addReference("");
        boolean boolean15 = jSDocInfoBuilder1.recordParameterDescription("", "");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordType(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean9 = jSDocInfoBuilder1.addReference("");
        boolean boolean11 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        boolean boolean24 = jSDocInfoBuilder1.recordBlockDescription("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder26 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean27 = jSDocInfoBuilder26.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder26.recordTypedef(jSTypeExpression28);
        boolean boolean30 = jSDocInfoBuilder26.isPopulatedWithFileOverview();
        boolean boolean31 = jSDocInfoBuilder26.recordPreserveTry();
        boolean boolean33 = jSDocInfoBuilder26.addReference("hi!");
        jSDocInfoBuilder26.recordOriginalCommentString("");
        boolean boolean36 = jSDocInfoBuilder26.recordJavaDispatch();
        boolean boolean37 = jSDocInfoBuilder26.recordJavaDispatch();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = jSDocInfoBuilder26.recordTemplateTypeNames((java.util.List<java.lang.String>) strList40);
        boolean boolean43 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList40);
        boolean boolean44 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean6 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean8 = jSDocInfoBuilder1.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfoBuilder1.markTypeNode(node7, (int) (byte) 1, (int) (byte) 0, 0, (int) (short) -1, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = jSDocInfoBuilder1.build(node6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSDocInfo7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean15 = jSDocInfoBuilder1.recordMeaning("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        boolean boolean29 = jSDocInfoBuilder1.recordMeaning("hi!");
        java.lang.Class<?> wildcardClass30 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        boolean boolean16 = jSDocInfoBuilder1.addReference("");
        boolean boolean17 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordType(jSTypeExpression16);
        boolean boolean18 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        boolean boolean32 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean33 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean17 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordNoAlias();
        java.lang.Class<?> wildcardClass19 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        java.lang.Class<?> wildcardClass23 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean9 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean11 = jSDocInfoBuilder1.recordDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordType(jSTypeExpression12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        boolean boolean22 = jSDocInfoBuilder1.recordExport();
        boolean boolean23 = jSDocInfoBuilder1.isPopulated();
        boolean boolean24 = jSDocInfoBuilder1.recordExterns();
        boolean boolean25 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression32);
        boolean boolean34 = jSDocInfoBuilder1.recordHiddenness();
        jSDocInfoBuilder1.markText("hi!", 100, 0, (int) '4', 0);
        boolean boolean42 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean3 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.Node node4 = null;
        jSDocInfoBuilder1.markTypeNode(node4, (int) (short) -1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1, true);
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean13 = jSDocInfoBuilder1.isPopulated();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = jSDocInfoBuilder1.build(node20);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jSDocInfo21);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean17 = jSDocInfoBuilder1.isDescriptionRecorded();
        java.lang.Class<?> wildcardClass18 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression21, "");
        boolean boolean24 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        boolean boolean24 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean13 = jSDocInfoBuilder1.recordLends("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean5 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        jSDocInfoBuilder1.markText("hi!", (int) ' ', 10, (int) (short) 10, 0);
        boolean boolean12 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        boolean boolean22 = jSDocInfoBuilder1.recordExport();
        boolean boolean23 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder1.recordType(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder7 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder7.recordEnumParameterType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder7.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder7.recordTypedef(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder7.recordDeprecated();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder15.recordEnumParameterType(jSTypeExpression16);
        boolean boolean18 = jSDocInfoBuilder15.recordIdGenerator();
        boolean boolean20 = jSDocInfoBuilder15.recordLends("");
        boolean boolean22 = jSDocInfoBuilder15.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility23 = null;
        boolean boolean24 = jSDocInfoBuilder15.recordVisibility(visibility23);
        boolean boolean27 = jSDocInfoBuilder15.recordParameterDescription("", "");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder29 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean30 = jSDocInfoBuilder29.recordNoAlias();
        boolean boolean31 = jSDocInfoBuilder29.recordJavaDispatch();
        boolean boolean33 = jSDocInfoBuilder29.recordMeaning("");
        jSDocInfoBuilder29.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder41 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        boolean boolean47 = jSDocInfoBuilder41.recordModifies((java.util.Set<java.lang.String>) strSet45);
        boolean boolean48 = jSDocInfoBuilder29.recordModifies((java.util.Set<java.lang.String>) strSet45);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = null;
        boolean boolean50 = jSDocInfoBuilder29.recordExtendedInterface(jSTypeExpression49);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder52 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder52.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder52.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean63 = jSDocInfoBuilder52.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder65 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        boolean boolean71 = jSDocInfoBuilder65.recordModifies((java.util.Set<java.lang.String>) strSet69);
        boolean boolean72 = jSDocInfoBuilder52.recordSuppressions((java.util.Set<java.lang.String>) strSet69);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        boolean boolean78 = jSDocInfoBuilder52.recordTemplateTypeNames((java.util.List<java.lang.String>) strList76);
        boolean boolean79 = jSDocInfoBuilder29.recordTemplateTypeNames((java.util.List<java.lang.String>) strList76);
        boolean boolean80 = jSDocInfoBuilder15.recordTemplateTypeNames((java.util.List<java.lang.String>) strList76);
        boolean boolean81 = jSDocInfoBuilder7.recordTemplateTypeNames((java.util.List<java.lang.String>) strList76);
        boolean boolean82 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.Node node5 = null;
        jSDocInfoBuilder1.markTypeNode(node5, (-1), 1, (int) (short) 0, 10, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression15);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markName("", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean5 = jSDocInfoBuilder1.recordExpose();
        boolean boolean6 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression16);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression20, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        boolean boolean20 = jSDocInfoBuilder1.recordExport();
        boolean boolean21 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression10, "hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordReturnDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        boolean boolean25 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression24);
        boolean boolean26 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("hi!");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = jSDocInfoBuilder1.build(node15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression17);
        boolean boolean20 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jSDocInfo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        boolean boolean26 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = jSDocInfoBuilder1.build(node27);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSDocInfo28);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean9 = jSDocInfoBuilder1.recordInterface();
        boolean boolean10 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression12, "");
        java.lang.Class<?> wildcardClass15 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean17 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder13.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder13.recordType(jSTypeExpression20);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean25 = jSDocInfoBuilder23.recordMeaning("");
        boolean boolean26 = jSDocInfoBuilder23.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean29 = jSDocInfoBuilder28.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = jSDocInfoBuilder28.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = jSDocInfoBuilder23.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean40 = jSDocInfoBuilder13.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean41 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean43 = jSDocInfoBuilder1.recordReturnDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.hasParameter("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean14 = jSDocInfoBuilder12.recordMeaning("");
        boolean boolean15 = jSDocInfoBuilder12.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean18 = jSDocInfoBuilder17.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = jSDocInfoBuilder17.recordSuppressions((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = jSDocInfoBuilder12.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean29 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean32 = jSDocInfoBuilder1.recordParameterDescription("hi!", "");
        boolean boolean34 = jSDocInfoBuilder1.recordFileOverview("hi!");
        jSDocInfoBuilder1.markText("", (int) (byte) -1, (int) (byte) -1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        jSDocInfoBuilder1.markText("", (-1), 100, (int) (short) 1, (int) (short) 0);
        boolean boolean30 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean31 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean17 = jSDocInfoBuilder1.recordExpose();
        boolean boolean19 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        jSDocInfoBuilder1.markText("hi!", (int) ' ', 10, (int) (short) 10, 0);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder13.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder21 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder21.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder21.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean32 = jSDocInfoBuilder21.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder34 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        boolean boolean40 = jSDocInfoBuilder34.recordModifies((java.util.Set<java.lang.String>) strSet38);
        boolean boolean41 = jSDocInfoBuilder21.recordSuppressions((java.util.Set<java.lang.String>) strSet38);
        boolean boolean42 = jSDocInfoBuilder13.recordSuppressions((java.util.Set<java.lang.String>) strSet38);
        boolean boolean43 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile45, (int) (byte) 10, (-1));
        boolean boolean49 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression13);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        boolean boolean15 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression12, "");
        boolean boolean16 = jSDocInfoBuilder1.addReference("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder10 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder10.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder10.recordType(jSTypeExpression17);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = jSDocInfoBuilder10.recordSuppressions((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        jSDocInfoBuilder10.markName("", staticSourceFile29, (int) '4', (int) (byte) 10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = null;
        boolean boolean34 = jSDocInfoBuilder10.recordBaseType(jSTypeExpression33);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = null;
        boolean boolean38 = jSDocInfoBuilder36.recordEnumParameterType(jSTypeExpression37);
        boolean boolean39 = jSDocInfoBuilder36.isInterfaceRecorded();
        boolean boolean40 = jSDocInfoBuilder36.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean43 = jSDocInfoBuilder42.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder45 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        boolean boolean51 = jSDocInfoBuilder45.recordModifies((java.util.Set<java.lang.String>) strSet49);
        boolean boolean52 = jSDocInfoBuilder42.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean53 = jSDocInfoBuilder36.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean54 = jSDocInfoBuilder10.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean55 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordExpose();
        boolean boolean16 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        boolean boolean26 = jSDocInfoBuilder1.recordOverride();
        boolean boolean28 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = jSDocInfoBuilder1.build(node8);
        boolean boolean11 = jSDocInfoBuilder1.recordFileOverview("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordThisType(jSTypeExpression12);
        com.google.javascript.rhino.Node node14 = null;
        jSDocInfoBuilder1.markTypeNode(node14, (int) (short) -1, (int) '#', (int) 'a', 10, true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression15, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordVisibility(visibility10);
        boolean boolean12 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression15);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder18 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder18.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder18.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean29 = jSDocInfoBuilder18.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = jSDocInfoBuilder18.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = jSDocInfoBuilder18.recordTemplateTypeNames((java.util.List<java.lang.String>) strList42);
        boolean boolean45 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList42);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = null;
        boolean boolean47 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression46);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        boolean boolean24 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean25 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean27 = jSDocInfoBuilder1.recordFileOverview("hi!");
        boolean boolean29 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder27 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder27.recordEnumParameterType(jSTypeExpression28);
        boolean boolean30 = jSDocInfoBuilder27.isInterfaceRecorded();
        boolean boolean31 = jSDocInfoBuilder27.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder33 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean34 = jSDocInfoBuilder33.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        boolean boolean42 = jSDocInfoBuilder36.recordModifies((java.util.Set<java.lang.String>) strSet40);
        boolean boolean43 = jSDocInfoBuilder33.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean44 = jSDocInfoBuilder27.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean45 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        jSDocInfoBuilder1.markName("hi!", (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean11 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        java.lang.Class<?> wildcardClass12 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordLends("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordJavaDispatch();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean17 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList15);
        boolean boolean18 = jSDocInfoBuilder1.recordExpose();
        boolean boolean19 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean12 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        jSDocInfoBuilder1.markText("hi!", (int) (short) 10, (int) (byte) 0, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile21, (int) (short) 100, (int) (byte) 100);
        jSDocInfoBuilder1.markName("", 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        boolean boolean11 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression10, "");
        boolean boolean13 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean15 = jSDocInfoBuilder1.recordFileOverview("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = jSDocInfoBuilder14.recordModifies((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet18);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList25);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markText("hi!", (int) '#', 0, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean15 = jSDocInfoBuilder1.recordExpose();
        boolean boolean16 = jSDocInfoBuilder1.recordInterface();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markText("hi!", 10, (int) '4', (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean6 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfoBuilder1.markTypeNode(node6, 0, (int) (byte) 0, (int) (short) 1, (int) (short) -1, false);
        boolean boolean13 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordExpose();
        boolean boolean13 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean18 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean20 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean22 = jSDocInfoBuilder1.recordDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet17);
        java.lang.Class<?> wildcardClass21 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean12 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordType(jSTypeExpression13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression16, "");
        boolean boolean19 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean17 = jSDocInfoBuilder1.recordLends("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        boolean boolean20 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        boolean boolean16 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        boolean boolean24 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean25 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean26 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean27 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = jSDocInfoBuilder9.recordModifies((java.util.Set<java.lang.String>) strSet13);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder9.recordType(jSTypeExpression16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        boolean boolean22 = jSDocInfoBuilder9.recordModifies((java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet20);
        boolean boolean25 = jSDocInfoBuilder1.recordMeaning("");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder9.recordEnumParameterType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder9.recordIdGenerator();
        boolean boolean14 = jSDocInfoBuilder9.recordLends("");
        boolean boolean16 = jSDocInfoBuilder9.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility17 = null;
        boolean boolean18 = jSDocInfoBuilder9.recordVisibility(visibility17);
        boolean boolean21 = jSDocInfoBuilder9.recordParameterDescription("", "");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean24 = jSDocInfoBuilder23.recordNoAlias();
        boolean boolean25 = jSDocInfoBuilder23.recordJavaDispatch();
        boolean boolean27 = jSDocInfoBuilder23.recordMeaning("");
        jSDocInfoBuilder23.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        boolean boolean41 = jSDocInfoBuilder35.recordModifies((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = jSDocInfoBuilder23.recordModifies((java.util.Set<java.lang.String>) strSet39);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = null;
        boolean boolean44 = jSDocInfoBuilder23.recordExtendedInterface(jSTypeExpression43);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder46 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder46.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder46.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean57 = jSDocInfoBuilder46.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder59 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        boolean boolean65 = jSDocInfoBuilder59.recordModifies((java.util.Set<java.lang.String>) strSet63);
        boolean boolean66 = jSDocInfoBuilder46.recordSuppressions((java.util.Set<java.lang.String>) strSet63);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        boolean boolean72 = jSDocInfoBuilder46.recordTemplateTypeNames((java.util.List<java.lang.String>) strList70);
        boolean boolean73 = jSDocInfoBuilder23.recordTemplateTypeNames((java.util.List<java.lang.String>) strList70);
        boolean boolean74 = jSDocInfoBuilder9.recordTemplateTypeNames((java.util.List<java.lang.String>) strList70);
        boolean boolean75 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList70);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = null;
        boolean boolean78 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression76, "");
        boolean boolean79 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression7);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        boolean boolean21 = jSDocInfoBuilder1.recordParameterDescription("", "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        boolean boolean15 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean16 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean17 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean19 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordThisType(jSTypeExpression17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean8 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        boolean boolean17 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean19 = jSDocInfoBuilder1.recordMeaning("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) (byte) 0, (int) (short) 10);
        boolean boolean10 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression32);
        boolean boolean34 = jSDocInfoBuilder1.recordHiddenness();
        jSDocInfoBuilder1.markText("hi!", 100, 0, (int) '4', 0);
        boolean boolean41 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean44 = jSDocInfoBuilder1.recordParameterDescription("hi!", "");
        boolean boolean46 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder13.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder13.recordType(jSTypeExpression20);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean25 = jSDocInfoBuilder23.recordMeaning("");
        boolean boolean26 = jSDocInfoBuilder23.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean29 = jSDocInfoBuilder28.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = jSDocInfoBuilder28.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = jSDocInfoBuilder23.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean40 = jSDocInfoBuilder13.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean41 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean42 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.Node node43 = null;
        jSDocInfoBuilder1.markTypeNode(node43, (int) (short) 100, (int) (short) -1, 100, (int) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean15 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean17 = jSDocInfoBuilder1.recordVersion("hi!");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression32);
        boolean boolean34 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean17 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordType(jSTypeExpression18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean9 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean11 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean10 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean12 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression10);
        boolean boolean14 = jSDocInfoBuilder1.recordParameterDescription("hi!", "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        boolean boolean18 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        boolean boolean25 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression24);
        boolean boolean26 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean27 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = jSDocInfoBuilder9.recordModifies((java.util.Set<java.lang.String>) strSet13);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder9.recordType(jSTypeExpression16);
        boolean boolean18 = jSDocInfoBuilder9.recordPreserveTry();
        boolean boolean19 = jSDocInfoBuilder9.isDescriptionRecorded();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = null;
        boolean boolean21 = jSDocInfoBuilder9.recordVisibility(visibility20);
        boolean boolean22 = jSDocInfoBuilder9.recordConsistentIdGenerator();
        boolean boolean23 = jSDocInfoBuilder9.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean26 = jSDocInfoBuilder25.recordNoAlias();
        boolean boolean27 = jSDocInfoBuilder25.recordJavaDispatch();
        boolean boolean29 = jSDocInfoBuilder25.recordMeaning("");
        jSDocInfoBuilder25.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        boolean boolean43 = jSDocInfoBuilder37.recordModifies((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = jSDocInfoBuilder25.recordModifies((java.util.Set<java.lang.String>) strSet41);
        boolean boolean45 = jSDocInfoBuilder9.recordSuppressions((java.util.Set<java.lang.String>) strSet41);
        boolean boolean46 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet41);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        boolean boolean19 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean20 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean21 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression6);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean12 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordType(jSTypeExpression13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        boolean boolean18 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordVisibility(visibility19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression22);
        java.lang.Class<?> wildcardClass24 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        boolean boolean24 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean25 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean26 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = null;
        boolean boolean28 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression27);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = null;
        boolean boolean30 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean15 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean16 = jSDocInfoBuilder1.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean14 = jSDocInfoBuilder1.addReference("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean14 = jSDocInfoBuilder12.recordMeaning("");
        boolean boolean15 = jSDocInfoBuilder12.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean18 = jSDocInfoBuilder17.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = jSDocInfoBuilder17.recordSuppressions((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = jSDocInfoBuilder12.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean29 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet24);
        java.lang.Class<?> wildcardClass30 = strSet24.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.isPopulated();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression16);
        boolean boolean18 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression16);
        boolean boolean18 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        jSDocInfoBuilder1.markName("hi!", (int) (short) 100, 1);
        boolean boolean17 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        boolean boolean29 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean30 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = null;
        boolean boolean32 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression31);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.markText("hi!", (int) (short) 1, 1, (int) (short) 1, (int) '#');
        boolean boolean16 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean17 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean19 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean20 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        boolean boolean24 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean25 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean26 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = null;
        boolean boolean28 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression27);
        boolean boolean29 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = jSDocInfoBuilder1.build(node8);
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        java.util.Set<java.lang.String> strSet11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordModifies(strSet11);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordExpose();
        boolean boolean15 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression10);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean9 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfoBuilder1.markTypeNode(node10, (int) (short) 0, (int) (short) 1, 0, (int) (short) -1, false);
        boolean boolean17 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean18 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile11, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression21, "");
        boolean boolean25 = jSDocInfoBuilder1.recordVersion("hi!");
        jSDocInfoBuilder1.markAnnotation("hi!", (int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markName("", staticSourceFile31, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean10 = jSDocInfoBuilder1.hasParameter("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.hasParameter("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean12 = jSDocInfoBuilder1.recordDescription("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordVisibility(visibility13);
        boolean boolean16 = jSDocInfoBuilder1.recordMeaning("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean6 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean7 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordThisType(jSTypeExpression8);
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfoBuilder1.markTypeNode(node10, (int) (byte) 10, 100, (int) ' ', (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean14 = jSDocInfoBuilder1.recordFileOverview("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        boolean boolean13 = jSDocInfoBuilder1.recordReturnDescription("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordType(jSTypeExpression14);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile17, (int) (byte) -1, (int) (short) 100);
        boolean boolean21 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile9, 10, (-1));
        boolean boolean13 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression14);
        boolean boolean16 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean4 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean6 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean8 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean29 = jSDocInfoBuilder1.recordVersion("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean14 = jSDocInfoBuilder12.recordMeaning("");
        boolean boolean15 = jSDocInfoBuilder12.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean18 = jSDocInfoBuilder17.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = jSDocInfoBuilder17.recordSuppressions((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = jSDocInfoBuilder12.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean29 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean32 = jSDocInfoBuilder1.recordParameterDescription("hi!", "");
        boolean boolean33 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        boolean boolean9 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean10 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression11, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean19 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean20 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean6 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder1.recordDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression7);
        boolean boolean9 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression11);
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean16 = jSDocInfoBuilder1.hasParameter("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        jSDocInfoBuilder1.markAnnotation("hi!", (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("");
        boolean boolean16 = jSDocInfoBuilder1.isJavaDispatch();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfoBuilder1.markTypeNode(node10, (int) (short) 1, (int) (byte) 0, (int) (short) 100, (int) (short) 100, false);
        boolean boolean17 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean19 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression20, "hi!");
        boolean boolean23 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression16);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        boolean boolean20 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean22 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean9 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean10 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean7 = jSDocInfoBuilder1.isPopulated();
        jSDocInfoBuilder1.markText("", (int) (short) 10, 1, (int) (short) 1, 1);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordVisibility(visibility14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean15 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        boolean boolean23 = jSDocInfoBuilder17.recordModifies((java.util.Set<java.lang.String>) strSet21);
        boolean boolean24 = jSDocInfoBuilder17.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = null;
        boolean boolean26 = jSDocInfoBuilder17.recordTypedef(jSTypeExpression25);
        boolean boolean27 = jSDocInfoBuilder17.recordIdGenerator();
        jSDocInfoBuilder17.markName("hi!", (int) '#', (int) (short) 1);
        boolean boolean33 = jSDocInfoBuilder17.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        boolean boolean41 = jSDocInfoBuilder35.recordModifies((java.util.Set<java.lang.String>) strSet39);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = null;
        boolean boolean43 = jSDocInfoBuilder35.recordType(jSTypeExpression42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean48 = jSDocInfoBuilder35.recordModifies((java.util.Set<java.lang.String>) strSet46);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder50 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = jSDocInfoBuilder50.recordModifies((java.util.Set<java.lang.String>) strSet54);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression57 = null;
        boolean boolean58 = jSDocInfoBuilder50.recordTypedef(jSTypeExpression57);
        boolean boolean59 = jSDocInfoBuilder50.isInterfaceRecorded();
        boolean boolean60 = jSDocInfoBuilder50.recordJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder62 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        boolean boolean68 = jSDocInfoBuilder62.recordModifies((java.util.Set<java.lang.String>) strSet66);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression69 = null;
        boolean boolean70 = jSDocInfoBuilder62.recordTypedef(jSTypeExpression69);
        boolean boolean71 = jSDocInfoBuilder62.isInterfaceRecorded();
        boolean boolean72 = jSDocInfoBuilder62.recordPreserveTry();
        boolean boolean73 = jSDocInfoBuilder62.recordNoSideEffects();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder75 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean76 = jSDocInfoBuilder75.recordNoAlias();
        boolean boolean77 = jSDocInfoBuilder75.recordJavaDispatch();
        boolean boolean79 = jSDocInfoBuilder75.recordMeaning("");
        jSDocInfoBuilder75.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder87 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray90 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        boolean boolean93 = jSDocInfoBuilder87.recordModifies((java.util.Set<java.lang.String>) strSet91);
        boolean boolean94 = jSDocInfoBuilder75.recordModifies((java.util.Set<java.lang.String>) strSet91);
        boolean boolean95 = jSDocInfoBuilder62.recordSuppressions((java.util.Set<java.lang.String>) strSet91);
        boolean boolean96 = jSDocInfoBuilder50.recordSuppressions((java.util.Set<java.lang.String>) strSet91);
        boolean boolean97 = jSDocInfoBuilder35.recordModifies((java.util.Set<java.lang.String>) strSet91);
        boolean boolean98 = jSDocInfoBuilder17.recordSuppressions((java.util.Set<java.lang.String>) strSet91);
        boolean boolean99 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet91);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfoBuilder1.markTypeNode(node10, (int) (short) 1, (int) (byte) 0, (int) (short) 100, (int) (short) 100, false);
        boolean boolean17 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        boolean boolean70 = jSDocInfoBuilder1.recordLends("");
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression21, "");
        boolean boolean25 = jSDocInfoBuilder1.recordVersion("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean28 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression26, "");
        boolean boolean30 = jSDocInfoBuilder1.recordDeprecationReason("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean6 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean7 = jSDocInfoBuilder1.recordExpose();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean16 = jSDocInfoBuilder1.recordLends("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean13 = jSDocInfoBuilder11.recordMeaning("");
        boolean boolean14 = jSDocInfoBuilder11.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean17 = jSDocInfoBuilder16.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        boolean boolean25 = jSDocInfoBuilder19.recordModifies((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = jSDocInfoBuilder16.recordSuppressions((java.util.Set<java.lang.String>) strSet23);
        boolean boolean27 = jSDocInfoBuilder11.recordModifies((java.util.Set<java.lang.String>) strSet23);
        boolean boolean28 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet23);
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
        boolean boolean64 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet59);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean6 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean19 = jSDocInfoBuilder1.recordDescription("hi!");
        java.lang.Class<?> wildcardClass20 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean19 = jSDocInfoBuilder1.recordMeaning("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean6 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean7 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean19 = jSDocInfoBuilder1.recordDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        boolean boolean22 = jSDocInfoBuilder1.recordExport();
        boolean boolean23 = jSDocInfoBuilder1.isPopulated();
        boolean boolean24 = jSDocInfoBuilder1.isPopulated();
        boolean boolean25 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        jSDocInfoBuilder1.markText("", (int) (byte) 1, 1, (int) (byte) 100, 100);
        boolean boolean17 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean18 = jSDocInfoBuilder1.recordExpose();
        boolean boolean19 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        boolean boolean19 = jSDocInfoBuilder1.recordMeaning("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean5 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean7 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean8 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean14 = jSDocInfoBuilder1.addAuthor("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression16);
        boolean boolean19 = jSDocInfoBuilder1.recordDescription("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        boolean boolean24 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean25 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression26);
        boolean boolean29 = jSDocInfoBuilder1.hasParameter("hi!");
        boolean boolean31 = jSDocInfoBuilder1.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression4);
        boolean boolean6 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean7 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = jSDocInfoBuilder1.build(node8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSDocInfo9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        boolean boolean13 = jSDocInfoBuilder1.recordReturnDescription("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordType(jSTypeExpression14);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile17, (int) (byte) -1, (int) (short) 100);
        boolean boolean22 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean6 = jSDocInfoBuilder1.recordDeprecationReason("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = jSDocInfoBuilder1.build(node7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSDocInfo8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordThisType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean9 = jSDocInfoBuilder1.recordVersion("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean13 = jSDocInfoBuilder11.recordMeaning("");
        boolean boolean14 = jSDocInfoBuilder11.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean17 = jSDocInfoBuilder16.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        boolean boolean25 = jSDocInfoBuilder19.recordModifies((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = jSDocInfoBuilder16.recordSuppressions((java.util.Set<java.lang.String>) strSet23);
        boolean boolean27 = jSDocInfoBuilder11.recordModifies((java.util.Set<java.lang.String>) strSet23);
        boolean boolean28 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet23);
        boolean boolean29 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean30 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression13);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean10 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean11 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordExterns();
        boolean boolean15 = jSDocInfoBuilder1.recordExpose();
        boolean boolean16 = jSDocInfoBuilder1.recordOverride();
        boolean boolean18 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder18 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder18.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder18.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean29 = jSDocInfoBuilder18.shouldParseDocumentation();
        boolean boolean30 = jSDocInfoBuilder18.isPopulated();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = jSDocInfoBuilder18.recordTemplateTypeNames((java.util.List<java.lang.String>) strList34);
        boolean boolean37 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList34);
        boolean boolean38 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean12 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean13 = jSDocInfoBuilder1.recordInterface();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordExpose();
        boolean boolean13 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean14 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        com.google.javascript.rhino.Node node8 = null;
        jSDocInfoBuilder1.markTypeNode(node8, (int) '#', 0, (int) '4', (int) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.isPopulated();
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 1, (int) (short) 100, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.markText("hi!", (int) (short) 1, 1, (int) (short) 1, (int) '#');
        boolean boolean16 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean17 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean19 = jSDocInfoBuilder1.recordBlockDescription("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean12 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile11, 100, 0);
        boolean boolean16 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean7 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean9 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean6 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean8 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean10 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean11 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean14 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression18, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean18 = jSDocInfoBuilder1.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean21 = jSDocInfoBuilder20.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = null;
        boolean boolean23 = jSDocInfoBuilder20.recordTypedef(jSTypeExpression22);
        boolean boolean24 = jSDocInfoBuilder20.recordInterface();
        boolean boolean25 = jSDocInfoBuilder20.recordExpose();
        boolean boolean26 = jSDocInfoBuilder20.recordNoSideEffects();
        boolean boolean28 = jSDocInfoBuilder20.recordLends("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean31 = jSDocInfoBuilder30.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder30.recordTypedef(jSTypeExpression32);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder35.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder43 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder43.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder43.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean54 = jSDocInfoBuilder43.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder56 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean62 = jSDocInfoBuilder56.recordModifies((java.util.Set<java.lang.String>) strSet60);
        boolean boolean63 = jSDocInfoBuilder43.recordSuppressions((java.util.Set<java.lang.String>) strSet60);
        boolean boolean64 = jSDocInfoBuilder35.recordSuppressions((java.util.Set<java.lang.String>) strSet60);
        boolean boolean65 = jSDocInfoBuilder30.recordModifies((java.util.Set<java.lang.String>) strSet60);
        boolean boolean66 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet60);
        boolean boolean67 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet60);
        boolean boolean69 = jSDocInfoBuilder1.recordDeprecationReason("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        jSDocInfoBuilder1.markText("", (-1), 100, (int) (short) 1, (int) (short) 0);
        boolean boolean30 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean32 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean7 = jSDocInfoBuilder1.isPopulated();
        boolean boolean9 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean13 = jSDocInfoBuilder1.isPopulated();
        boolean boolean15 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.Node node9 = null;
        jSDocInfoBuilder1.markTypeNode(node9, (int) (short) 1, (int) (short) 0, 10, (int) (short) 1, true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        boolean boolean18 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordVisibility(visibility19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression32);
        boolean boolean34 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean35 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean36 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        boolean boolean23 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        boolean boolean21 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        boolean boolean24 = jSDocInfoBuilder1.recordParameterDescription("", "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression32);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        boolean boolean41 = jSDocInfoBuilder35.recordModifies((java.util.Set<java.lang.String>) strSet39);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = null;
        boolean boolean43 = jSDocInfoBuilder35.recordTypedef(jSTypeExpression42);
        boolean boolean44 = jSDocInfoBuilder35.isInterfaceRecorded();
        boolean boolean45 = jSDocInfoBuilder35.recordJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder47 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        boolean boolean53 = jSDocInfoBuilder47.recordModifies((java.util.Set<java.lang.String>) strSet51);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = null;
        boolean boolean55 = jSDocInfoBuilder47.recordTypedef(jSTypeExpression54);
        boolean boolean56 = jSDocInfoBuilder47.isInterfaceRecorded();
        boolean boolean57 = jSDocInfoBuilder47.recordPreserveTry();
        boolean boolean58 = jSDocInfoBuilder47.recordNoSideEffects();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder60 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean61 = jSDocInfoBuilder60.recordNoAlias();
        boolean boolean62 = jSDocInfoBuilder60.recordJavaDispatch();
        boolean boolean64 = jSDocInfoBuilder60.recordMeaning("");
        jSDocInfoBuilder60.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder72 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        boolean boolean78 = jSDocInfoBuilder72.recordModifies((java.util.Set<java.lang.String>) strSet76);
        boolean boolean79 = jSDocInfoBuilder60.recordModifies((java.util.Set<java.lang.String>) strSet76);
        boolean boolean80 = jSDocInfoBuilder47.recordSuppressions((java.util.Set<java.lang.String>) strSet76);
        boolean boolean81 = jSDocInfoBuilder35.recordSuppressions((java.util.Set<java.lang.String>) strSet76);
        boolean boolean82 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet76);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression21);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder24.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder24.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean35 = jSDocInfoBuilder24.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        boolean boolean43 = jSDocInfoBuilder37.recordModifies((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = jSDocInfoBuilder24.recordSuppressions((java.util.Set<java.lang.String>) strSet41);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = jSDocInfoBuilder24.recordTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        boolean boolean51 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        com.google.javascript.rhino.Node node52 = null;
        jSDocInfoBuilder1.markTypeNode(node52, (int) (byte) 0, (int) (short) 0, (int) 'a', 10, true);
        boolean boolean59 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile61, (int) (byte) 10, (int) (byte) 10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = null;
        boolean boolean66 = jSDocInfoBuilder1.recordType(jSTypeExpression65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder13.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder13.recordType(jSTypeExpression20);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean25 = jSDocInfoBuilder23.recordMeaning("");
        boolean boolean26 = jSDocInfoBuilder23.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean29 = jSDocInfoBuilder28.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = jSDocInfoBuilder28.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = jSDocInfoBuilder23.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean40 = jSDocInfoBuilder13.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean41 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean43 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean45 = jSDocInfoBuilder1.recordVersion("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        boolean boolean27 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder1.recordType(jSTypeExpression28);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        com.google.javascript.rhino.Node node35 = null;
        jSDocInfoBuilder1.markTypeNode(node35, 10, (-1), (int) ' ', (int) '#', false);
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        boolean boolean21 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean9 = jSDocInfoBuilder1.recordExpose();
        boolean boolean10 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean11 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean7 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean8 = jSDocInfoBuilder1.recordOverride();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.hasParameter("hi!");
        boolean boolean19 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        boolean boolean20 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean15 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        jSDocInfoBuilder1.markText("hi!", (int) ' ', 10, (int) (short) 10, 0);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean7 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean8 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean9 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        boolean boolean14 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean15 = jSDocInfoBuilder1.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordType(jSTypeExpression16);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean13 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean15 = jSDocInfoBuilder1.recordMeaning("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean13 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.hasParameter("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression19);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder14.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder14.recordType(jSTypeExpression21);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean26 = jSDocInfoBuilder24.recordMeaning("");
        boolean boolean27 = jSDocInfoBuilder24.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder29 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean30 = jSDocInfoBuilder29.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder32 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        boolean boolean38 = jSDocInfoBuilder32.recordModifies((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = jSDocInfoBuilder29.recordSuppressions((java.util.Set<java.lang.String>) strSet36);
        boolean boolean40 = jSDocInfoBuilder24.recordModifies((java.util.Set<java.lang.String>) strSet36);
        boolean boolean41 = jSDocInfoBuilder14.recordSuppressions((java.util.Set<java.lang.String>) strSet36);
        boolean boolean42 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet36);
        boolean boolean44 = jSDocInfoBuilder1.recordLends("");
        boolean boolean46 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        boolean boolean9 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean4 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordThisType(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean7 = jSDocInfoBuilder1.recordExpose();
        boolean boolean9 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        boolean boolean23 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSDocInfo22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordNoSideEffects();
        jSDocInfoBuilder1.markName("hi!", (int) '4', (int) (short) 0);
        boolean boolean18 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean13 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile18, (int) '4', (int) (byte) 1);
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean16 = jSDocInfoBuilder1.recordIdGenerator();
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordType(jSTypeExpression15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean15 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile17, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean17 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = null;
        boolean boolean35 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean10 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean11 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean12 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean9 = jSDocInfoBuilder1.recordConstructor();
        java.lang.Class<?> wildcardClass10 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean16 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean18 = jSDocInfoBuilder1.recordFileOverview("hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordReturnDescription("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        boolean boolean21 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean10 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean11 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        boolean boolean13 = jSDocInfoBuilder1.recordReturnDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordImplicitCast();
        jSDocInfoBuilder1.markName("", 100, (int) (byte) -1);
        boolean boolean19 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean16 = jSDocInfoBuilder1.addReference("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.recordExpose();
        boolean boolean11 = jSDocInfoBuilder1.addReference("");
        boolean boolean12 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression21);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder24.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder24.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean35 = jSDocInfoBuilder24.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        boolean boolean43 = jSDocInfoBuilder37.recordModifies((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = jSDocInfoBuilder24.recordSuppressions((java.util.Set<java.lang.String>) strSet41);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = jSDocInfoBuilder24.recordTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        boolean boolean51 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        com.google.javascript.rhino.Node node52 = null;
        jSDocInfoBuilder1.markTypeNode(node52, (int) (byte) 0, (int) (short) 0, (int) 'a', 10, true);
        boolean boolean59 = jSDocInfoBuilder1.recordExterns();
        boolean boolean60 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder10 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder10.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder10.recordType(jSTypeExpression17);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = jSDocInfoBuilder10.recordSuppressions((java.util.Set<java.lang.String>) strSet24);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        jSDocInfoBuilder10.markName("", staticSourceFile29, (int) '4', (int) (byte) 10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = null;
        boolean boolean34 = jSDocInfoBuilder10.recordBaseType(jSTypeExpression33);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = null;
        boolean boolean38 = jSDocInfoBuilder36.recordEnumParameterType(jSTypeExpression37);
        boolean boolean39 = jSDocInfoBuilder36.isInterfaceRecorded();
        boolean boolean40 = jSDocInfoBuilder36.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean43 = jSDocInfoBuilder42.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder45 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        boolean boolean51 = jSDocInfoBuilder45.recordModifies((java.util.Set<java.lang.String>) strSet49);
        boolean boolean52 = jSDocInfoBuilder42.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean53 = jSDocInfoBuilder36.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean54 = jSDocInfoBuilder10.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean55 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        boolean boolean56 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = jSDocInfoBuilder1.build(node2);
        org.junit.Assert.assertNull(jSDocInfo3);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean17 = jSDocInfoBuilder1.hasParameter("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression18);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) (byte) 0, (int) (short) 10);
        boolean boolean10 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean13 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        boolean boolean13 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        boolean boolean45 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean46 = jSDocInfoBuilder1.recordNoAlias();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean7 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean10 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markText("hi!", 10, (int) (short) 1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 1?end-char: -1");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression12);
        boolean boolean15 = jSDocInfoBuilder1.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        boolean boolean14 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecated();
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean18 = jSDocInfoBuilder1.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean21 = jSDocInfoBuilder20.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = null;
        boolean boolean23 = jSDocInfoBuilder20.recordTypedef(jSTypeExpression22);
        boolean boolean24 = jSDocInfoBuilder20.recordInterface();
        boolean boolean25 = jSDocInfoBuilder20.recordExpose();
        boolean boolean26 = jSDocInfoBuilder20.recordNoSideEffects();
        boolean boolean28 = jSDocInfoBuilder20.recordLends("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean31 = jSDocInfoBuilder30.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder30.recordTypedef(jSTypeExpression32);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder35.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder43 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder43.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder43.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean54 = jSDocInfoBuilder43.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder56 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean62 = jSDocInfoBuilder56.recordModifies((java.util.Set<java.lang.String>) strSet60);
        boolean boolean63 = jSDocInfoBuilder43.recordSuppressions((java.util.Set<java.lang.String>) strSet60);
        boolean boolean64 = jSDocInfoBuilder35.recordSuppressions((java.util.Set<java.lang.String>) strSet60);
        boolean boolean65 = jSDocInfoBuilder30.recordModifies((java.util.Set<java.lang.String>) strSet60);
        boolean boolean66 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet60);
        boolean boolean67 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet60);
        boolean boolean68 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean13 = jSDocInfoBuilder1.recordReturnDescription("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean15 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = jSDocInfoBuilder14.recordModifies((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile23, 0, 100);
        boolean boolean27 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean29 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean31 = jSDocInfoBuilder1.recordMeaning("hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = jSDocInfoBuilder14.recordModifies((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile23, 0, 100);
        boolean boolean27 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean29 = jSDocInfoBuilder1.recordLends("");
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markText("", (int) 'a', 100, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 97?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        boolean boolean14 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean15 = jSDocInfoBuilder1.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean18 = jSDocInfoBuilder17.recordNoAlias();
        boolean boolean19 = jSDocInfoBuilder17.recordJavaDispatch();
        boolean boolean21 = jSDocInfoBuilder17.recordMeaning("");
        jSDocInfoBuilder17.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder29 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        boolean boolean35 = jSDocInfoBuilder29.recordModifies((java.util.Set<java.lang.String>) strSet33);
        boolean boolean36 = jSDocInfoBuilder17.recordModifies((java.util.Set<java.lang.String>) strSet33);
        boolean boolean37 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet33);
        boolean boolean38 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean7 = jSDocInfoBuilder1.recordFileOverview("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean7 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean10 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        boolean boolean11 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean13 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean15 = jSDocInfoBuilder1.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordMeaning("");
        java.lang.Class<?> wildcardClass4 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean18 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean9 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordVisibility(visibility10);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.recordInterface();
        boolean boolean14 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean11 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean7 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean8 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean9 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean8 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.Node node9 = null;
        jSDocInfoBuilder1.markTypeNode(node9, (int) (byte) 10, 100, (int) '#', 100, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean7 = jSDocInfoBuilder1.recordExpose();
        boolean boolean9 = jSDocInfoBuilder1.addReference("");
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean7 = jSDocInfoBuilder1.addReference("");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        boolean boolean12 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        boolean boolean11 = jSDocInfoBuilder1.recordNoShadow();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        boolean boolean22 = jSDocInfoBuilder1.recordExport();
        boolean boolean23 = jSDocInfoBuilder1.isPopulated();
        java.lang.Class<?> wildcardClass24 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        boolean boolean27 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression16);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        boolean boolean20 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean21 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean19 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = jSDocInfoBuilder1.build(node20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jSDocInfo21);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        boolean boolean12 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordDescription("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression32);
        boolean boolean34 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean36 = jSDocInfoBuilder1.recordVersion("");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        boolean boolean26 = jSDocInfoBuilder1.isDescriptionRecorded();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean9 = jSDocInfoBuilder1.recordVersion("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean13 = jSDocInfoBuilder11.recordMeaning("");
        boolean boolean14 = jSDocInfoBuilder11.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean17 = jSDocInfoBuilder16.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        boolean boolean25 = jSDocInfoBuilder19.recordModifies((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = jSDocInfoBuilder16.recordSuppressions((java.util.Set<java.lang.String>) strSet23);
        boolean boolean27 = jSDocInfoBuilder11.recordModifies((java.util.Set<java.lang.String>) strSet23);
        boolean boolean28 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet23);
        boolean boolean29 = jSDocInfoBuilder1.recordExterns();
        boolean boolean30 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        boolean boolean13 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean14 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean11 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        boolean boolean24 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        com.google.javascript.rhino.Node node18 = null;
        jSDocInfoBuilder1.markTypeNode(node18, (int) '#', 0, (int) (byte) 100, 0, true);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder26 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder26.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = null;
        boolean boolean34 = jSDocInfoBuilder26.recordType(jSTypeExpression33);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        boolean boolean42 = jSDocInfoBuilder36.recordModifies((java.util.Set<java.lang.String>) strSet40);
        boolean boolean43 = jSDocInfoBuilder26.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = jSDocInfoBuilder26.build(node44);
        boolean boolean47 = jSDocInfoBuilder26.recordVersion("");
        boolean boolean49 = jSDocInfoBuilder26.recordBlockDescription("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder51 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean52 = jSDocInfoBuilder51.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = null;
        boolean boolean54 = jSDocInfoBuilder51.recordTypedef(jSTypeExpression53);
        boolean boolean55 = jSDocInfoBuilder51.isPopulatedWithFileOverview();
        boolean boolean56 = jSDocInfoBuilder51.recordPreserveTry();
        boolean boolean58 = jSDocInfoBuilder51.addReference("hi!");
        jSDocInfoBuilder51.recordOriginalCommentString("");
        boolean boolean61 = jSDocInfoBuilder51.recordJavaDispatch();
        boolean boolean62 = jSDocInfoBuilder51.recordJavaDispatch();
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = jSDocInfoBuilder51.recordTemplateTypeNames((java.util.List<java.lang.String>) strList65);
        boolean boolean68 = jSDocInfoBuilder26.recordTemplateTypeNames((java.util.List<java.lang.String>) strList65);
        boolean boolean69 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList65);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSDocInfo45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean6 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean7 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean18 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        boolean boolean14 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        boolean boolean15 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        boolean boolean18 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSDocInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        boolean boolean14 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordType(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.isPopulated();
        boolean boolean9 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        boolean boolean16 = jSDocInfoBuilder1.addAuthor("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean11 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression12);
        jSDocInfoBuilder1.markText("hi!", (int) (byte) -1, 10, (int) (byte) -1, (int) (short) 10);
        boolean boolean20 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) (byte) 0, (int) (short) 10);
        boolean boolean10 = jSDocInfoBuilder1.recordJavaDispatch();
        jSDocInfoBuilder1.markName("hi!", (-1), 0);
        boolean boolean16 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean8 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordThisType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordType(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression14, "hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordLends("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = jSDocInfoBuilder1.build(node8);
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        java.util.Set<java.lang.String> strSet11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordModifies(strSet11);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordVisibility(visibility13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean9 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfoBuilder1.markTypeNode(node10, (int) (short) 0, (int) (short) 1, 0, (int) (short) -1, false);
        boolean boolean17 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean9 = jSDocInfoBuilder1.recordInterface();
        boolean boolean11 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean19 = jSDocInfoBuilder1.recordExpose();
        boolean boolean21 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean3 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.Node node4 = null;
        jSDocInfoBuilder1.markTypeNode(node4, (int) (short) -1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1, true);
        boolean boolean11 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordOverride();
        boolean boolean15 = jSDocInfoBuilder1.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder16.recordEnumParameterType(jSTypeExpression17);
        boolean boolean19 = jSDocInfoBuilder16.recordIdGenerator();
        boolean boolean21 = jSDocInfoBuilder16.recordLends("");
        boolean boolean23 = jSDocInfoBuilder16.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        boolean boolean25 = jSDocInfoBuilder16.recordVisibility(visibility24);
        boolean boolean28 = jSDocInfoBuilder16.recordParameterDescription("", "");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder30.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder30.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean41 = jSDocInfoBuilder30.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder43 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        boolean boolean49 = jSDocInfoBuilder43.recordModifies((java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = jSDocInfoBuilder30.recordSuppressions((java.util.Set<java.lang.String>) strSet47);
        boolean boolean51 = jSDocInfoBuilder16.recordModifies((java.util.Set<java.lang.String>) strSet47);
        boolean boolean52 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility53 = null;
        boolean boolean54 = jSDocInfoBuilder1.recordVisibility(visibility53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder12.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder12.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean23 = jSDocInfoBuilder12.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder12.recordEnumParameterType(jSTypeExpression24);
        boolean boolean26 = jSDocInfoBuilder12.recordInterface();
        boolean boolean28 = jSDocInfoBuilder12.recordLends("");
        boolean boolean29 = jSDocInfoBuilder12.recordIdGenerator();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean32 = jSDocInfoBuilder31.recordNoAlias();
        boolean boolean33 = jSDocInfoBuilder31.recordJavaDispatch();
        boolean boolean35 = jSDocInfoBuilder31.recordMeaning("");
        jSDocInfoBuilder31.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder43 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        boolean boolean49 = jSDocInfoBuilder43.recordModifies((java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet47);
        boolean boolean51 = jSDocInfoBuilder12.recordSuppressions((java.util.Set<java.lang.String>) strSet47);
        boolean boolean52 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet47);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        java.lang.Class<?> wildcardClass3 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean5 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean18 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean9 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordThisType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.isInterfaceRecorded();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordThisType(jSTypeExpression22);
        java.lang.Class<?> wildcardClass24 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean10 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordType(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordExterns();
        boolean boolean15 = jSDocInfoBuilder1.recordExpose();
        jSDocInfoBuilder1.markAnnotation("hi!", (int) (byte) 0, (int) (byte) 0);
        boolean boolean20 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = jSDocInfoBuilder1.build(node8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        boolean boolean14 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = jSDocInfoBuilder1.recordOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression16);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        boolean boolean9 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordLends("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder18 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder18.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean26 = jSDocInfoBuilder18.recordVersion("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean30 = jSDocInfoBuilder28.recordMeaning("");
        boolean boolean31 = jSDocInfoBuilder28.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder33 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean34 = jSDocInfoBuilder33.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        boolean boolean42 = jSDocInfoBuilder36.recordModifies((java.util.Set<java.lang.String>) strSet40);
        boolean boolean43 = jSDocInfoBuilder33.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean44 = jSDocInfoBuilder28.recordModifies((java.util.Set<java.lang.String>) strSet40);
        boolean boolean45 = jSDocInfoBuilder18.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean46 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression21);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder24.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder24.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean35 = jSDocInfoBuilder24.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        boolean boolean43 = jSDocInfoBuilder37.recordModifies((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = jSDocInfoBuilder24.recordSuppressions((java.util.Set<java.lang.String>) strSet41);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = jSDocInfoBuilder24.recordTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        boolean boolean51 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList48);
        com.google.javascript.rhino.Node node52 = null;
        jSDocInfoBuilder1.markTypeNode(node52, (int) (byte) 0, (int) (short) 0, (int) 'a', 10, true);
        boolean boolean59 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean60 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression12);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder15.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder15.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean26 = jSDocInfoBuilder15.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = null;
        boolean boolean28 = jSDocInfoBuilder15.recordEnumParameterType(jSTypeExpression27);
        boolean boolean29 = jSDocInfoBuilder15.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = null;
        boolean boolean31 = jSDocInfoBuilder15.recordThisType(jSTypeExpression30);
        boolean boolean33 = jSDocInfoBuilder15.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder35 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder35.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = null;
        boolean boolean43 = jSDocInfoBuilder35.recordType(jSTypeExpression42);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder45 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        boolean boolean51 = jSDocInfoBuilder45.recordModifies((java.util.Set<java.lang.String>) strSet49);
        boolean boolean52 = jSDocInfoBuilder35.recordSuppressions((java.util.Set<java.lang.String>) strSet49);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = jSDocInfoBuilder35.build(node53);
        boolean boolean56 = jSDocInfoBuilder35.recordVersion("");
        boolean boolean58 = jSDocInfoBuilder35.recordBlockDescription("");
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
        boolean boolean77 = jSDocInfoBuilder35.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        boolean boolean78 = jSDocInfoBuilder15.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        boolean boolean79 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jSDocInfo54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
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
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordVersion("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean4 = jSDocInfoBuilder1.recordDeprecationReason("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean3 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean9 = jSDocInfoBuilder1.recordExpose();
        boolean boolean10 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordExpose();
        boolean boolean14 = jSDocInfoBuilder1.recordLends("");
        boolean boolean15 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = jSDocInfoBuilder14.recordModifies((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet18);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList25);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression28);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean32 = jSDocInfoBuilder31.recordConstructor();
        boolean boolean33 = jSDocInfoBuilder31.recordConstancy();
        com.google.javascript.rhino.Node node34 = null;
        jSDocInfoBuilder31.markTypeNode(node34, (int) (short) -1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1, true);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = jSDocInfoBuilder31.recordTemplateTypeNames((java.util.List<java.lang.String>) strList43);
        boolean boolean46 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList43);
        boolean boolean47 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean48 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        boolean boolean18 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        boolean boolean14 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean15 = jSDocInfoBuilder1.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean18 = jSDocInfoBuilder17.recordNoAlias();
        boolean boolean19 = jSDocInfoBuilder17.recordJavaDispatch();
        boolean boolean21 = jSDocInfoBuilder17.recordMeaning("");
        jSDocInfoBuilder17.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder29 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        boolean boolean35 = jSDocInfoBuilder29.recordModifies((java.util.Set<java.lang.String>) strSet33);
        boolean boolean36 = jSDocInfoBuilder17.recordModifies((java.util.Set<java.lang.String>) strSet33);
        boolean boolean37 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet33);
        boolean boolean38 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        boolean boolean24 = jSDocInfoBuilder1.isPopulated();
        boolean boolean26 = jSDocInfoBuilder1.recordDescription("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecationReason("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean11 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean12 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean14 = jSDocInfoBuilder1.recordReturnDescription("");
        boolean boolean16 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean17 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean11 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        jSDocInfoBuilder1.markText("hi!", (int) (short) 0, (int) 'a', (int) 'a', (int) (short) 100);
        boolean boolean39 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("hi!");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = jSDocInfoBuilder1.build(node15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression17);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordVisibility(visibility19);
        boolean boolean21 = jSDocInfoBuilder1.recordIdGenerator();
        java.lang.Class<?> wildcardClass22 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jSDocInfo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean19 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean20 = jSDocInfoBuilder1.recordExterns();
        boolean boolean21 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        com.google.javascript.rhino.Node node15 = null;
        jSDocInfoBuilder1.markTypeNode(node15, 10, (int) (byte) 10, 0, (int) '#', true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        boolean boolean15 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder13.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder13.recordType(jSTypeExpression20);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean25 = jSDocInfoBuilder23.recordMeaning("");
        boolean boolean26 = jSDocInfoBuilder23.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean29 = jSDocInfoBuilder28.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = jSDocInfoBuilder28.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = jSDocInfoBuilder23.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean40 = jSDocInfoBuilder13.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean41 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean42 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean45 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        boolean boolean19 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile9, (int) ' ', (int) '#');
        boolean boolean15 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        boolean boolean25 = jSDocInfoBuilder1.hasParameter("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = null;
        boolean boolean27 = jSDocInfoBuilder1.recordVisibility(visibility26);
        boolean boolean29 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean30 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean8 = jSDocInfoBuilder1.recordOverride();
        boolean boolean9 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordVisibility(visibility10);
        jSDocInfoBuilder1.markAnnotation("hi!", 10, (int) 'a');
        jSDocInfoBuilder1.markName("hi!", (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean13 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean15 = jSDocInfoBuilder1.recordVersion("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        boolean boolean14 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        java.lang.Class<?> wildcardClass4 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean17 = jSDocInfoBuilder1.recordExterns();
        java.lang.Class<?> wildcardClass18 = jSDocInfoBuilder1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = jSDocInfoBuilder1.build(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = jSDocInfoBuilder1.build(node10);
        boolean boolean13 = jSDocInfoBuilder1.recordVersion("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jSDocInfo9);
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.recordExpose();
        boolean boolean11 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordVisibility(visibility12);
        boolean boolean14 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean12 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean16 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean18 = jSDocInfoBuilder1.addAuthor("");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder4 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = jSDocInfoBuilder4.recordModifies((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet8);
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean14 = jSDocInfoBuilder1.recordExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        boolean boolean25 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean26 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        boolean boolean4 = jSDocInfoBuilder1.recordParameterDescription("hi!", "");
        boolean boolean5 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean6 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.hasParameter("hi!");
        boolean boolean19 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = null;
        boolean boolean35 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression34);
        boolean boolean37 = jSDocInfoBuilder1.recordFileOverview("hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean7 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean9 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean11 = jSDocInfoBuilder1.addReference("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        boolean boolean32 = jSDocInfoBuilder1.recordConsistentIdGenerator();
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordExterns();
        boolean boolean15 = jSDocInfoBuilder1.recordExpose();
        boolean boolean16 = jSDocInfoBuilder1.recordOverride();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean10 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        boolean boolean13 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordThisType(jSTypeExpression16);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThisType(jSTypeExpression18);
        boolean boolean20 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean6 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean7 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordExterns();
        boolean boolean12 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordMeaning("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean14 = jSDocInfoBuilder1.addAuthor("hi!");
        boolean boolean16 = jSDocInfoBuilder1.hasParameter("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        jSDocInfoBuilder1.markText("", (int) (byte) 1, 1, (int) (byte) 100, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression8);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile11, (int) (short) -1, (int) '#');
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean7 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.isDescriptionRecorded();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean14 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        boolean boolean18 = jSDocInfoBuilder1.isJavaDispatch();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression12, "");
        boolean boolean16 = jSDocInfoBuilder1.recordFileOverview("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.addAuthor("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.isPopulated();
        boolean boolean19 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean20 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean3 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.Node node4 = null;
        jSDocInfoBuilder1.markTypeNode(node4, (int) (short) -1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1, true);
        boolean boolean11 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordOverride();
        boolean boolean15 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean16 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean19 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile21, 10, (int) (byte) 0);
        boolean boolean26 = jSDocInfoBuilder1.recordFileOverview("hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        boolean boolean12 = jSDocInfoBuilder1.recordDeprecated();
        java.lang.Class<?> wildcardClass13 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean8 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean10 = jSDocInfoBuilder1.recordLends("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder27 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder27.recordEnumParameterType(jSTypeExpression28);
        boolean boolean30 = jSDocInfoBuilder27.isInterfaceRecorded();
        boolean boolean31 = jSDocInfoBuilder27.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder33 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean34 = jSDocInfoBuilder33.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        boolean boolean42 = jSDocInfoBuilder36.recordModifies((java.util.Set<java.lang.String>) strSet40);
        boolean boolean43 = jSDocInfoBuilder33.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean44 = jSDocInfoBuilder27.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean45 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet40);
        boolean boolean46 = jSDocInfoBuilder1.recordInterface();
        boolean boolean47 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean48 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean15 = jSDocInfoBuilder1.recordReturnDescription("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = jSDocInfoBuilder1.build(node16);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression18);
        boolean boolean21 = jSDocInfoBuilder1.hasParameter("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jSDocInfo17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean8 = jSDocInfoBuilder1.recordFileOverview("");
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean14 = jSDocInfoBuilder12.recordMeaning("");
        boolean boolean15 = jSDocInfoBuilder12.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean18 = jSDocInfoBuilder17.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder20 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        boolean boolean26 = jSDocInfoBuilder20.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = jSDocInfoBuilder17.recordSuppressions((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = jSDocInfoBuilder12.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean29 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet24);
        boolean boolean30 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean8 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean9 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        boolean boolean14 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean17 = jSDocInfoBuilder1.recordParameterDescription("", "");
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        boolean boolean26 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean27 = jSDocInfoBuilder1.recordOverride();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean5 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordConstructor();
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordExpose();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean9 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordThisType(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        boolean boolean12 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression8);
        boolean boolean11 = jSDocInfoBuilder1.hasParameter("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression14);
        jSDocInfoBuilder1.markName("", (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        boolean boolean8 = jSDocInfoBuilder1.recordExport();
        boolean boolean9 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.recordPreserveTry();
        jSDocInfoBuilder1.markName("", 0, (int) '#');
        boolean boolean14 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.isPopulated();
        boolean boolean20 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean21 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.Node node22 = null;
        jSDocInfoBuilder1.markTypeNode(node22, (int) (byte) 1, (int) '#', (int) (short) 100, 0, true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.recordDeprecated();
        java.lang.Class<?> wildcardClass9 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        boolean boolean14 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = jSDocInfoBuilder1.build(node15);
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSDocInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean7 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean3 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.isPopulated();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean11 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean13 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordInterface();
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        boolean boolean16 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression17, "");
        boolean boolean20 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean19 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean17 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean19 = jSDocInfoBuilder1.recordDeprecationReason("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

