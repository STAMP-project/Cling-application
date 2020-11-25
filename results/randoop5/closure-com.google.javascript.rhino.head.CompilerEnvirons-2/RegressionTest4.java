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
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean12 = compilerEnvirons0.isGenerateDebugInfo();
        int int13 = compilerEnvirons0.getLanguageVersion();
        boolean boolean14 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        int int6 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 170 + "'", int6 == 170);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setStrictMode(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean12 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(errorReporter12);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        boolean boolean11 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        boolean boolean21 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean22 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean25 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        compilerEnvirons11.setLanguageVersion(0);
        boolean boolean19 = compilerEnvirons11.isGeneratingSource();
        compilerEnvirons11.setStrictMode(false);
        int int22 = compilerEnvirons11.getOptimizationLevel();
        compilerEnvirons11.setStrictMode(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(errorReporter25);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = compilerEnvirons9.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecordingComments(true);
        int int28 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        java.lang.Class<?> wildcardClass10 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

