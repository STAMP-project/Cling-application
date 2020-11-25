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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean6 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet11 = null;
        compilerEnvirons10.setActivationNames(strSet11);
        int int13 = compilerEnvirons10.getLanguageVersion();
        boolean boolean14 = compilerEnvirons10.isReservedKeywordAsIdentifier();
        int int15 = compilerEnvirons10.getLanguageVersion();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons10.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter16);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(errorReporter16);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        int int11 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        int int9 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(errorReporter14);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet7 = null;
        compilerEnvirons6.setActivationNames(strSet7);
        int int9 = compilerEnvirons6.getLanguageVersion();
        compilerEnvirons6.setRecordingLocalJsDocComments(false);
        compilerEnvirons6.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = compilerEnvirons14.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = compilerEnvirons14.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons14.getErrorReporter();
        compilerEnvirons6.setErrorReporter(errorReporter29);
        compilerEnvirons0.setErrorReporter(errorReporter29);
        boolean boolean32 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean15 = compilerEnvirons14.getAllowSharpComments();
        compilerEnvirons14.setGeneratingSource(true);
        boolean boolean18 = compilerEnvirons14.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setLanguageVersion(0);
        boolean boolean27 = compilerEnvirons19.isGeneratingSource();
        boolean boolean28 = compilerEnvirons19.isRecordingLocalJsDocComments();
        boolean boolean29 = compilerEnvirons19.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet33);
        boolean boolean36 = compilerEnvirons30.isGenerateDebugInfo();
        compilerEnvirons30.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        compilerEnvirons39.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        boolean boolean45 = compilerEnvirons39.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons46 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        compilerEnvirons46.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons39.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean23 = compilerEnvirons0.isRecordingComments();
        boolean boolean24 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setXmlAvailable(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = compilerEnvirons12.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean23 = compilerEnvirons22.reportWarningAsError();
        boolean boolean24 = compilerEnvirons22.isRecordingComments();
        int int25 = compilerEnvirons22.getLanguageVersion();
        java.util.Set<java.lang.String> strSet26 = compilerEnvirons22.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet28 = null;
        compilerEnvirons27.setActivationNames(strSet28);
        boolean boolean30 = compilerEnvirons27.isAllowMemberExprAsFunctionName();
        boolean boolean31 = compilerEnvirons27.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = compilerEnvirons32.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        compilerEnvirons39.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        compilerEnvirons48.setActivationNames((java.util.Set<java.lang.String>) strSet51);
        boolean boolean54 = compilerEnvirons48.isGenerateDebugInfo();
        compilerEnvirons48.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons57 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        compilerEnvirons57.setActivationNames((java.util.Set<java.lang.String>) strSet60);
        boolean boolean63 = compilerEnvirons57.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons64 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        compilerEnvirons64.setActivationNames((java.util.Set<java.lang.String>) strSet67);
        compilerEnvirons57.setActivationNames((java.util.Set<java.lang.String>) strSet67);
        compilerEnvirons48.setActivationNames((java.util.Set<java.lang.String>) strSet67);
        compilerEnvirons48.setAllowSharpComments(false);
        compilerEnvirons48.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter76 = compilerEnvirons48.getErrorReporter();
        compilerEnvirons22.setErrorReporter(errorReporter76);
        compilerEnvirons0.setErrorReporter(errorReporter76);
        compilerEnvirons0.setStrictMode(true);
        int int81 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 170 + "'", int25 == 170);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(errorReporter76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setOptimizationLevel(0);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = compilerEnvirons21.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean35 = compilerEnvirons21.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean37 = compilerEnvirons36.reportWarningAsError();
        int int38 = compilerEnvirons36.getOptimizationLevel();
        compilerEnvirons36.setAllowMemberExprAsFunctionName(true);
        boolean boolean41 = compilerEnvirons36.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons36.getErrorReporter();
        compilerEnvirons21.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean45 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        boolean boolean14 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        boolean boolean23 = compilerEnvirons0.isIdeMode();
        int int24 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean25 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(true);
        compilerEnvirons9.setStrictMode(true);
        boolean boolean14 = compilerEnvirons9.isIdeMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        boolean boolean12 = compilerEnvirons0.reportWarningAsError();
        boolean boolean13 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGenerateObserverCount();
        int int21 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean22 = compilerEnvirons0.isStrictMode();
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons0.getActivationNames();
        boolean boolean24 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean25 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGeneratingSource(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = compilerEnvirons11.isGenerateDebugInfo();
        compilerEnvirons11.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = compilerEnvirons20.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        boolean boolean11 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(errorReporter14);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion((int) (short) 0);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean13 = compilerEnvirons0.isGenerateDebugInfo();
        int int14 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean15 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        boolean boolean8 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        int int10 = compilerEnvirons0.getLanguageVersion();
        int int11 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean16 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setStrictMode(false);
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons12.setGenerateObserverCount(true);
        compilerEnvirons12.setStrictMode(true);
        compilerEnvirons12.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean25 = compilerEnvirons24.reportWarningAsError();
        compilerEnvirons24.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = compilerEnvirons24.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter28);
        boolean boolean30 = compilerEnvirons12.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        boolean boolean37 = compilerEnvirons31.isStrictMode();
        boolean boolean38 = compilerEnvirons31.isXmlAvailable();
        compilerEnvirons31.setGenerateObserverCount(true);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet44);
        compilerEnvirons31.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons31.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        compilerEnvirons51.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        compilerEnvirons51.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons59 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        compilerEnvirons59.setActivationNames((java.util.Set<java.lang.String>) strSet62);
        boolean boolean65 = compilerEnvirons59.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons66 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        compilerEnvirons66.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons59.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons51.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet69);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorReporter28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons11.setRecordingLocalJsDocComments(true);
        compilerEnvirons11.setStrictMode(true);
        boolean boolean16 = compilerEnvirons11.isIdeMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter17);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorReporter17);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean16 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons17.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        boolean boolean31 = compilerEnvirons25.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons17.getErrorReporter();
        compilerEnvirons15.setErrorReporter(errorReporter40);
        compilerEnvirons0.setErrorReporter(errorReporter40);
        boolean boolean43 = compilerEnvirons0.isRecordingComments();
        int int44 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons45 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean46 = compilerEnvirons45.reportWarningAsError();
        int int47 = compilerEnvirons45.getOptimizationLevel();
        compilerEnvirons45.setAllowMemberExprAsFunctionName(true);
        boolean boolean50 = compilerEnvirons45.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean52 = compilerEnvirons51.reportWarningAsError();
        compilerEnvirons51.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter55 = compilerEnvirons51.getErrorReporter();
        compilerEnvirons45.setErrorReporter(errorReporter55);
        compilerEnvirons0.setErrorReporter(errorReporter55);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(errorReporter40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(errorReporter55);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        boolean boolean12 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.getAllowSharpComments();
        compilerEnvirons9.setGeneratingSource(true);
        compilerEnvirons9.setAllowSharpComments(true);
        compilerEnvirons9.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet18 = null;
        compilerEnvirons17.setActivationNames(strSet18);
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons17.getActivationNames();
        boolean boolean21 = compilerEnvirons17.isGenerateObserverCount();
        boolean boolean22 = compilerEnvirons17.isReservedKeywordAsIdentifier();
        boolean boolean23 = compilerEnvirons17.recoverFromErrors();
        compilerEnvirons17.setOptimizationLevel(1);
        boolean boolean26 = compilerEnvirons17.isXmlAvailable();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(errorReporter8);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setStrictMode(true);
        boolean boolean21 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean22 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet5 = null;
        compilerEnvirons4.setActivationNames(strSet5);
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons4.getActivationNames();
        boolean boolean8 = compilerEnvirons4.recoverFromErrors();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compilerEnvirons4.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter9);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorReporter9);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean14 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        boolean boolean13 = compilerEnvirons0.isStrictMode();
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean19 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        int int21 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean16 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons17.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        boolean boolean31 = compilerEnvirons25.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons17.getErrorReporter();
        compilerEnvirons15.setErrorReporter(errorReporter40);
        compilerEnvirons0.setErrorReporter(errorReporter40);
        boolean boolean43 = compilerEnvirons0.isRecordingComments();
        boolean boolean44 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(errorReporter40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setAllowSharpComments(true);
        int int14 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = compilerEnvirons2.isStrictMode();
        boolean boolean9 = compilerEnvirons2.isXmlAvailable();
        compilerEnvirons2.setGenerateObserverCount(true);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons2.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons2.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons22.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet33);
        boolean boolean36 = compilerEnvirons30.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        compilerEnvirons37.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        boolean boolean47 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean13 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setStrictMode(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(errorReporter27);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setLanguageVersion((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean14 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        int int4 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons5.setRecordingLocalJsDocComments(true);
        compilerEnvirons5.setStrictMode(true);
        compilerEnvirons5.setRecordingLocalJsDocComments(false);
        boolean boolean12 = compilerEnvirons5.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean14 = compilerEnvirons13.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons13.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons13.setXmlAvailable(false);
        compilerEnvirons13.setGenerateDebugInfo(true);
        boolean boolean26 = compilerEnvirons13.isXmlAvailable();
        compilerEnvirons13.setRecordingComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        compilerEnvirons29.setActivationNames((java.util.Set<java.lang.String>) strSet32);
        compilerEnvirons29.setGenerateObserverCount(true);
        compilerEnvirons29.setWarnTrailingComma(true);
        boolean boolean39 = compilerEnvirons29.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet41 = null;
        compilerEnvirons40.setActivationNames(strSet41);
        java.util.Set<java.lang.String> strSet43 = compilerEnvirons40.getActivationNames();
        boolean boolean44 = compilerEnvirons40.isGenerateObserverCount();
        boolean boolean45 = compilerEnvirons40.isReservedKeywordAsIdentifier();
        boolean boolean46 = compilerEnvirons40.recoverFromErrors();
        compilerEnvirons40.setOptimizationLevel(1);
        boolean boolean49 = compilerEnvirons40.isXmlAvailable();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        compilerEnvirons40.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons29.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons13.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        boolean boolean60 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.reportWarningAsError();
        boolean boolean6 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean13 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 0);
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean19 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean20 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean25 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean13 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        int int9 = compilerEnvirons0.getLanguageVersion();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 170 + "'", int9 == 170);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean20 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int21 = compilerEnvirons0.getLanguageVersion();
        java.lang.Class<?> wildcardClass22 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGeneratingSource();
        boolean boolean21 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean22 = compilerEnvirons0.isRecordingComments();
        boolean boolean23 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        int int10 = compilerEnvirons0.getLanguageVersion();
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGenerateObserverCount();
        int int21 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean22 = compilerEnvirons0.isStrictMode();
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons0.getActivationNames();
        boolean boolean24 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean25 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean28 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(true);
        compilerEnvirons9.setStrictMode(true);
        boolean boolean14 = compilerEnvirons9.isIdeMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        boolean boolean17 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean9 = compilerEnvirons8.reportWarningAsError();
        int int10 = compilerEnvirons8.getOptimizationLevel();
        compilerEnvirons8.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons8.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean16 = compilerEnvirons15.reportWarningAsError();
        boolean boolean17 = compilerEnvirons15.isRecordingComments();
        boolean boolean18 = compilerEnvirons15.isAllowMemberExprAsFunctionName();
        compilerEnvirons15.setAllowSharpComments(false);
        boolean boolean21 = compilerEnvirons15.recoverFromErrors();
        compilerEnvirons15.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons24.setRecordingLocalJsDocComments(true);
        compilerEnvirons24.setStrictMode(true);
        boolean boolean29 = compilerEnvirons24.isIdeMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons24.getErrorReporter();
        compilerEnvirons15.setErrorReporter(errorReporter30);
        compilerEnvirons8.setErrorReporter(errorReporter30);
        compilerEnvirons0.setErrorReporter(errorReporter30);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(compilerEnvirons15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(errorReporter30);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet12 = null;
        compilerEnvirons11.setActivationNames(strSet12);
        java.util.Set<java.lang.String> strSet14 = compilerEnvirons11.getActivationNames();
        boolean boolean15 = compilerEnvirons11.isGenerateObserverCount();
        boolean boolean16 = compilerEnvirons11.isReservedKeywordAsIdentifier();
        boolean boolean17 = compilerEnvirons11.recoverFromErrors();
        compilerEnvirons11.setOptimizationLevel(1);
        boolean boolean20 = compilerEnvirons11.isXmlAvailable();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        int int10 = compilerEnvirons0.getLanguageVersion();
        boolean boolean11 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 170 + "'", int10 == 170);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean4 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean14 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        compilerEnvirons8.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons8.getErrorReporter();
        boolean boolean32 = compilerEnvirons8.reportWarningAsError();
        compilerEnvirons8.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean41 = compilerEnvirons35.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons42 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        compilerEnvirons42.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet45);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean53 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean16 = compilerEnvirons15.reportWarningAsError();
        int int17 = compilerEnvirons15.getOptimizationLevel();
        compilerEnvirons15.setAllowMemberExprAsFunctionName(true);
        boolean boolean20 = compilerEnvirons15.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compilerEnvirons15.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter21);
        compilerEnvirons0.setAllowSharpComments(true);
        int int25 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecoverFromErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(170);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 170");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean14 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        boolean boolean18 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isXmlAvailable();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean15 = compilerEnvirons14.reportWarningAsError();
        int int16 = compilerEnvirons14.getOptimizationLevel();
        compilerEnvirons14.setAllowMemberExprAsFunctionName(true);
        boolean boolean19 = compilerEnvirons14.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean21 = compilerEnvirons20.reportWarningAsError();
        compilerEnvirons20.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter24);
        compilerEnvirons0.setErrorReporter(errorReporter24);
        int int27 = compilerEnvirons0.getLanguageVersion();
        boolean boolean28 = compilerEnvirons0.recoverFromErrors();
        boolean boolean29 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean32 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean14 = compilerEnvirons13.isGenerateDebugInfo();
        compilerEnvirons13.setRecordingLocalJsDocComments(false);
        compilerEnvirons13.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons13.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons20.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = compilerEnvirons28.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons13.setErrorReporter(errorReporter43);
        compilerEnvirons0.setErrorReporter(errorReporter43);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean48 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean11 = compilerEnvirons0.isStrictMode();
        boolean boolean12 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean13 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setRecordingComments(false);
        int int16 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setOptimizationLevel(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        int int14 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean17 = compilerEnvirons0.isGenerateObserverCount();
        int int18 = compilerEnvirons0.getOptimizationLevel();
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(errorReporter8);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean12 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean17 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.reportWarningAsError();
        boolean boolean6 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet12 = null;
        compilerEnvirons11.setActivationNames(strSet12);
        int int14 = compilerEnvirons11.getLanguageVersion();
        compilerEnvirons11.setRecordingLocalJsDocComments(false);
        compilerEnvirons11.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean25 = compilerEnvirons19.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        compilerEnvirons26.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        boolean boolean33 = compilerEnvirons19.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons11.setErrorReporter(errorReporter34);
        compilerEnvirons0.setErrorReporter(errorReporter34);
        boolean boolean37 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(errorReporter34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        compilerEnvirons11.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean25 = compilerEnvirons19.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        compilerEnvirons26.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet29);
        boolean boolean34 = compilerEnvirons11.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean36 = compilerEnvirons35.reportWarningAsError();
        compilerEnvirons35.setReservedKeywordAsIdentifier(true);
        boolean boolean39 = compilerEnvirons35.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean41 = compilerEnvirons40.isGenerateDebugInfo();
        compilerEnvirons40.setRecordingLocalJsDocComments(false);
        compilerEnvirons40.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet46 = compilerEnvirons40.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        compilerEnvirons47.setActivationNames((java.util.Set<java.lang.String>) strSet50);
        compilerEnvirons47.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        compilerEnvirons55.setActivationNames((java.util.Set<java.lang.String>) strSet58);
        boolean boolean61 = compilerEnvirons55.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons62 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        compilerEnvirons62.setActivationNames((java.util.Set<java.lang.String>) strSet65);
        compilerEnvirons55.setActivationNames((java.util.Set<java.lang.String>) strSet65);
        compilerEnvirons47.setActivationNames((java.util.Set<java.lang.String>) strSet65);
        com.google.javascript.rhino.head.ErrorReporter errorReporter70 = compilerEnvirons47.getErrorReporter();
        compilerEnvirons40.setErrorReporter(errorReporter70);
        compilerEnvirons35.setErrorReporter(errorReporter70);
        compilerEnvirons11.setErrorReporter(errorReporter70);
        compilerEnvirons0.setErrorReporter(errorReporter70);
        boolean boolean75 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(errorReporter70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean12 = compilerEnvirons11.reportWarningAsError();
        compilerEnvirons11.setReservedKeywordAsIdentifier(true);
        compilerEnvirons11.setGeneratingSource(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter17);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(errorReporter17);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

