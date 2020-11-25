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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setErrorReporter(errorReporter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setIdeMode(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.Context context4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
        com.google.javascript.rhino.head.Context context24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setErrorReporter(errorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setXmlAvailable(false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
        com.google.javascript.rhino.head.Context context15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        com.google.javascript.rhino.head.Context context10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setErrorReporter(errorReporter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Context context4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        java.lang.Class<?> wildcardClass5 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setXmlAvailable(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setErrorReporter(errorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setXmlAvailable(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass9 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGeneratingSource(false);
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        boolean boolean15 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.Context context5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        java.lang.Class<?> wildcardClass7 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        java.lang.Class<?> wildcardClass13 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        java.lang.Class<?> wildcardClass15 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.Context context4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        int int7 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Context context3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        boolean boolean16 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons12.setGenerateObserverCount(true);
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
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons12.getErrorReporter();
        boolean boolean36 = compilerEnvirons12.reportWarningAsError();
        boolean boolean37 = compilerEnvirons12.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet39 = null;
        compilerEnvirons38.setActivationNames(strSet39);
        boolean boolean41 = compilerEnvirons38.isAllowMemberExprAsFunctionName();
        boolean boolean42 = compilerEnvirons38.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        boolean boolean49 = compilerEnvirons43.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons50 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        compilerEnvirons50.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet53);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.Context context11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setAllowSharpComments(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        java.lang.Class<?> wildcardClass5 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        java.lang.Class<?> wildcardClass13 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        java.lang.Class<?> wildcardClass13 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        compilerEnvirons0.setRecoverFromErrors(false);
        int int20 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean47 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        java.lang.Class<?> wildcardClass9 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.Context context10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.Context context19 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        int int5 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean27 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        boolean boolean22 = compilerEnvirons0.isGenerateObserverCount();
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
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean6 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons7.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons7.getErrorReporter();
        compilerEnvirons5.setErrorReporter(errorReporter30);
        compilerEnvirons0.setErrorReporter(errorReporter30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(compilerEnvirons5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(errorReporter30);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGeneratingSource();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean13 = compilerEnvirons0.getAllowSharpComments();
        java.lang.Class<?> wildcardClass14 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setErrorReporter(errorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowSharpComments(true);
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setStrictMode(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons12.setLanguageVersion(0);
        boolean boolean20 = compilerEnvirons12.isAllowMemberExprAsFunctionName();
        int int21 = compilerEnvirons12.getOptimizationLevel();
        boolean boolean22 = compilerEnvirons12.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        boolean boolean29 = compilerEnvirons23.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet33);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet33);
        boolean boolean37 = compilerEnvirons23.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean39 = compilerEnvirons38.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        compilerEnvirons40.setActivationNames((java.util.Set<java.lang.String>) strSet43);
        compilerEnvirons40.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        compilerEnvirons48.setActivationNames((java.util.Set<java.lang.String>) strSet51);
        boolean boolean54 = compilerEnvirons48.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        compilerEnvirons55.setActivationNames((java.util.Set<java.lang.String>) strSet58);
        compilerEnvirons48.setActivationNames((java.util.Set<java.lang.String>) strSet58);
        compilerEnvirons40.setActivationNames((java.util.Set<java.lang.String>) strSet58);
        com.google.javascript.rhino.head.ErrorReporter errorReporter63 = compilerEnvirons40.getErrorReporter();
        compilerEnvirons38.setErrorReporter(errorReporter63);
        compilerEnvirons23.setErrorReporter(errorReporter63);
        compilerEnvirons12.setErrorReporter(errorReporter63);
        compilerEnvirons0.setErrorReporter(errorReporter63);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(errorReporter63);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        boolean boolean24 = compilerEnvirons0.isGenerateObserverCount();
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setXmlAvailable(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
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
        boolean boolean39 = compilerEnvirons25.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons25.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter40);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(errorReporter40);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        java.lang.Class<?> wildcardClass5 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecordingComments(false);
        int int18 = compilerEnvirons0.getLanguageVersion();
        java.lang.Class<?> wildcardClass19 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        compilerEnvirons0.setRecoverFromErrors(false);
        int int20 = compilerEnvirons0.getLanguageVersion();
        int int21 = compilerEnvirons0.getLanguageVersion();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        com.google.javascript.rhino.head.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        java.lang.Class<?> wildcardClass9 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        java.util.Set<java.lang.String> strSet8 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean11 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        com.google.javascript.rhino.head.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        compilerEnvirons0.setRecoverFromErrors(false);
        int int20 = compilerEnvirons0.getLanguageVersion();
        int int21 = compilerEnvirons0.getLanguageVersion();
        java.lang.Class<?> wildcardClass22 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGeneratingSource();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons2.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons10.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = compilerEnvirons2.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter25);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(errorReporter25);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setGenerateObserverCount(true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(false);
        java.lang.Class<?> wildcardClass9 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGenerateObserverCount(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass10 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.lang.Class<?> wildcardClass16 = strSet13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        boolean boolean25 = compilerEnvirons0.isRecordingComments();
        boolean boolean26 = compilerEnvirons0.getWarnTrailingComma();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGeneratingSource(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getLanguageVersion();
        boolean boolean12 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setAllowSharpComments(false);
        com.google.javascript.rhino.head.Context context17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        java.lang.Class<?> wildcardClass3 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass4 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion(170);
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.Context context42 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
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
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean12 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        boolean boolean18 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        com.google.javascript.rhino.head.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setStrictMode(false);
        java.util.Set<java.lang.String> strSet14 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compilerEnvirons0.getErrorReporter();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(errorReporter8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        java.lang.Class<?> wildcardClass7 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean6 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        java.lang.Class<?> wildcardClass5 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        int int13 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setErrorReporter(errorReporter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean12 = compilerEnvirons0.isGeneratingSource();
        boolean boolean13 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        java.lang.Class<?> wildcardClass7 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        boolean boolean14 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean12 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 170 + "'", int5 == 170);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean19 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        java.lang.Class<?> wildcardClass9 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean9 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        int int12 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(errorReporter12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        compilerEnvirons0.setRecordingComments(true);
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean10 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        compilerEnvirons0.setStrictMode(true);
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
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean12 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean18 = compilerEnvirons0.isXmlAvailable();
        boolean boolean19 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean47 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean6 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        boolean boolean12 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        boolean boolean19 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean23 = compilerEnvirons0.reportWarningAsError();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons5.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons5.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons5.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons10.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons7.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons7.getErrorReporter();
        boolean boolean31 = compilerEnvirons7.reportWarningAsError();
        boolean boolean32 = compilerEnvirons7.isRecordingComments();
        java.util.Set<java.lang.String> strSet33 = compilerEnvirons7.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(errorReporter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean27 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isStrictMode();
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setOptimizationLevel((-1));
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean8 = compilerEnvirons7.isGenerateDebugInfo();
        compilerEnvirons7.setRecordingLocalJsDocComments(false);
        compilerEnvirons7.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons7.getActivationNames();
        compilerEnvirons7.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean17 = compilerEnvirons16.reportWarningAsError();
        int int18 = compilerEnvirons16.getOptimizationLevel();
        compilerEnvirons16.setAllowMemberExprAsFunctionName(true);
        boolean boolean21 = compilerEnvirons16.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons16.getErrorReporter();
        compilerEnvirons7.setErrorReporter(errorReporter22);
        compilerEnvirons0.setErrorReporter(errorReporter22);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorReporter22);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setOptimizationLevel(0);
        boolean boolean8 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        compilerEnvirons9.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = compilerEnvirons17.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compilerEnvirons9.getErrorReporter();
        boolean boolean33 = compilerEnvirons9.reportWarningAsError();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = compilerEnvirons36.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        int int15 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean16 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        int int12 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 170 + "'", int12 == 170);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        java.lang.Class<?> wildcardClass10 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean16 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(true);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        int int13 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        int int8 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 170 + "'", int8 == 170);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setXmlAvailable(false);
        com.google.javascript.rhino.head.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
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
        boolean boolean22 = compilerEnvirons8.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons8.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter23);
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean27 = compilerEnvirons0.isGeneratingSource();
        int int28 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        boolean boolean13 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean20 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingComments(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass51 = strSet45.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean13 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean15 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(170);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 170");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorReporter6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        boolean boolean48 = compilerEnvirons0.isReservedKeywordAsIdentifier();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean25 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        boolean boolean12 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorReporter9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setIdeMode(false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorReporter15);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean12 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        boolean boolean23 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.Context context26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(errorReporter18);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        int int40 = compilerEnvirons0.getOptimizationLevel();
        int int41 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons22.setLanguageVersion(0);
        boolean boolean30 = compilerEnvirons22.isAllowMemberExprAsFunctionName();
        int int31 = compilerEnvirons22.getOptimizationLevel();
        compilerEnvirons22.setIdeMode(false);
        boolean boolean34 = compilerEnvirons22.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons22.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter35);
        int int37 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        compilerEnvirons3.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = compilerEnvirons11.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons3.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter26);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(errorReporter26);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons33.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        compilerEnvirons33.setLanguageVersion(0);
        boolean boolean41 = compilerEnvirons33.isAllowMemberExprAsFunctionName();
        int int42 = compilerEnvirons33.getOptimizationLevel();
        boolean boolean43 = compilerEnvirons33.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = compilerEnvirons44.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        compilerEnvirons51.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = compilerEnvirons44.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons59 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean60 = compilerEnvirons59.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        compilerEnvirons61.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons69 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = compilerEnvirons69.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons76 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        compilerEnvirons76.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        com.google.javascript.rhino.head.ErrorReporter errorReporter84 = compilerEnvirons61.getErrorReporter();
        compilerEnvirons59.setErrorReporter(errorReporter84);
        compilerEnvirons44.setErrorReporter(errorReporter84);
        compilerEnvirons33.setErrorReporter(errorReporter84);
        compilerEnvirons8.setErrorReporter(errorReporter84);
        compilerEnvirons0.setErrorReporter(errorReporter84);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        int int92 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(errorReporter84);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isGenerateDebugInfo();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        compilerEnvirons9.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet15 = compilerEnvirons9.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons16.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = compilerEnvirons24.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compilerEnvirons16.getErrorReporter();
        compilerEnvirons9.setErrorReporter(errorReporter39);
        compilerEnvirons0.setErrorReporter(errorReporter39);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(errorReporter39);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        compilerEnvirons0.setRecoverFromErrors(false);
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
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        boolean boolean12 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        compilerEnvirons0.setRecordingComments(true);
        java.util.Set<java.lang.String> strSet25 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean12 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean16 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet13 = null;
        compilerEnvirons12.setActivationNames(strSet13);
        boolean boolean15 = compilerEnvirons12.isIdeMode();
        int int16 = compilerEnvirons12.getOptimizationLevel();
        compilerEnvirons12.setGeneratingSource(true);
        boolean boolean19 = compilerEnvirons12.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass7 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecordingComments(true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        int int11 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 170 + "'", int11 == 170);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean38 = compilerEnvirons0.getWarnTrailingComma();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean12 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.util.Set<java.lang.String> strSet10 = null;
        compilerEnvirons0.setActivationNames(strSet10);
        com.google.javascript.rhino.head.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        boolean boolean25 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet27 = null;
        compilerEnvirons26.setActivationNames(strSet27);
        boolean boolean29 = compilerEnvirons26.isAllowMemberExprAsFunctionName();
        boolean boolean30 = compilerEnvirons26.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        boolean boolean37 = compilerEnvirons31.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        compilerEnvirons26.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        boolean boolean47 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        java.lang.Class<?> wildcardClass4 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean11 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.util.Set<java.lang.String> strSet10 = null;
        compilerEnvirons0.setActivationNames(strSet10);
        boolean boolean12 = compilerEnvirons0.isIdeMode();
        boolean boolean13 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean6 = compilerEnvirons5.isGenerateDebugInfo();
        compilerEnvirons5.setRecordingLocalJsDocComments(false);
        compilerEnvirons5.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons5.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons12.setGenerateObserverCount(true);
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
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons12.getErrorReporter();
        compilerEnvirons5.setErrorReporter(errorReporter35);
        compilerEnvirons0.setErrorReporter(errorReporter35);
        boolean boolean38 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setIdeMode(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean10 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        boolean boolean27 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGeneratingSource(true);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean13 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        boolean boolean42 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean15 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.reportWarningAsError();
        boolean boolean6 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(errorReporter2);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        int int6 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 170 + "'", int6 == 170);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int5 = compilerEnvirons0.getLanguageVersion();
        com.google.javascript.rhino.head.Context context6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean16 = compilerEnvirons0.recoverFromErrors();
        boolean boolean17 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        boolean boolean47 = compilerEnvirons0.reportWarningAsError();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons22.setLanguageVersion(0);
        boolean boolean30 = compilerEnvirons22.isAllowMemberExprAsFunctionName();
        int int31 = compilerEnvirons22.getOptimizationLevel();
        compilerEnvirons22.setIdeMode(false);
        boolean boolean34 = compilerEnvirons22.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons22.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter35);
        boolean boolean37 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        int int8 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 170 + "'", int8 == 170);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.reportWarningAsError();
        int int11 = compilerEnvirons9.getOptimizationLevel();
        compilerEnvirons9.setAllowMemberExprAsFunctionName(true);
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        compilerEnvirons0.setStrictMode(false);
        boolean boolean19 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean20 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean8 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setOptimizationLevel((int) (byte) -1);
        int int13 = compilerEnvirons0.getOptimizationLevel();
        com.google.javascript.rhino.head.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        boolean boolean21 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        java.lang.Class<?> wildcardClass4 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        java.lang.Class<?> wildcardClass5 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean10 = compilerEnvirons9.isGenerateDebugInfo();
        compilerEnvirons9.setRecordingLocalJsDocComments(false);
        compilerEnvirons9.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet15 = compilerEnvirons9.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons16.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = compilerEnvirons24.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        compilerEnvirons31.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compilerEnvirons16.getErrorReporter();
        compilerEnvirons9.setErrorReporter(errorReporter39);
        compilerEnvirons0.setErrorReporter(errorReporter39);
        boolean boolean42 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(errorReporter39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean10 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean16 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
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
        boolean boolean22 = compilerEnvirons8.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons8.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter23);
        boolean boolean25 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        int int13 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        com.google.javascript.rhino.head.Context context17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compilerEnvirons0.getErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(errorReporter12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        int int40 = compilerEnvirons0.getOptimizationLevel();
        int int41 = compilerEnvirons0.getOptimizationLevel();
        com.google.javascript.rhino.head.Context context42 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean21 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        compilerEnvirons0.setGenerateDebugInfo(false);
        int int26 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons7.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons7.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter30);
        boolean boolean32 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(errorReporter30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean52 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setStrictMode(true);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(errorReporter5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        compilerEnvirons0.setRecoverFromErrors(false);
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
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean44 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecordingComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons16.setGenerateObserverCount(true);
        compilerEnvirons16.setWarnTrailingComma(true);
        boolean boolean26 = compilerEnvirons16.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet28 = null;
        compilerEnvirons27.setActivationNames(strSet28);
        java.util.Set<java.lang.String> strSet30 = compilerEnvirons27.getActivationNames();
        boolean boolean31 = compilerEnvirons27.isGenerateObserverCount();
        boolean boolean32 = compilerEnvirons27.isReservedKeywordAsIdentifier();
        boolean boolean33 = compilerEnvirons27.recoverFromErrors();
        compilerEnvirons27.setOptimizationLevel(1);
        boolean boolean36 = compilerEnvirons27.isXmlAvailable();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        com.google.javascript.rhino.head.Context context45 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons33.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        compilerEnvirons33.setLanguageVersion(0);
        boolean boolean41 = compilerEnvirons33.isAllowMemberExprAsFunctionName();
        int int42 = compilerEnvirons33.getOptimizationLevel();
        boolean boolean43 = compilerEnvirons33.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = compilerEnvirons44.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        compilerEnvirons51.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = compilerEnvirons44.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons59 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean60 = compilerEnvirons59.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        compilerEnvirons61.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons69 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = compilerEnvirons69.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons76 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        compilerEnvirons76.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        com.google.javascript.rhino.head.ErrorReporter errorReporter84 = compilerEnvirons61.getErrorReporter();
        compilerEnvirons59.setErrorReporter(errorReporter84);
        compilerEnvirons44.setErrorReporter(errorReporter84);
        compilerEnvirons33.setErrorReporter(errorReporter84);
        compilerEnvirons8.setErrorReporter(errorReporter84);
        compilerEnvirons0.setErrorReporter(errorReporter84);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean92 = compilerEnvirons0.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(errorReporter84);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        boolean boolean18 = compilerEnvirons0.isStrictMode();
        int int19 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setIdeMode(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        int int40 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean41 = compilerEnvirons0.reportWarningAsError();
        boolean boolean42 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean8 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = compilerEnvirons15.isGenerateDebugInfo();
        boolean boolean22 = compilerEnvirons15.isReservedKeywordAsIdentifier();
        compilerEnvirons15.setGenerateDebugInfo(true);
        boolean boolean25 = compilerEnvirons15.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = compilerEnvirons15.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorReporter26);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        boolean boolean23 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setXmlAvailable(false);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setStrictMode(false);
        java.util.Set<java.lang.String> strSet14 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean3 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons0.getErrorReporter();
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
        org.junit.Assert.assertNotNull(errorReporter24);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet9 = null;
        compilerEnvirons8.setActivationNames(strSet9);
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons8.getActivationNames();
        boolean boolean12 = compilerEnvirons8.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons8.recoverFromErrors();
        compilerEnvirons8.setOptimizationLevel(1);
        boolean boolean17 = compilerEnvirons8.isXmlAvailable();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isIdeMode();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setLanguageVersion((int) (byte) 0);
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        java.lang.Class<?> wildcardClass6 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        int int26 = compilerEnvirons0.getLanguageVersion();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setStrictMode(true);
        int int13 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 170 + "'", int13 == 170);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = compilerEnvirons0.getErrorReporter();
        int int11 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(errorReporter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setIdeMode(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet12 = null;
        compilerEnvirons11.setActivationNames(strSet12);
        boolean boolean14 = compilerEnvirons11.isAllowMemberExprAsFunctionName();
        boolean boolean15 = compilerEnvirons11.getAllowSharpComments();
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
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        compilerEnvirons0.setStrictMode(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        compilerEnvirons0.setStrictMode(true);
        boolean boolean17 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet21 = null;
        compilerEnvirons20.setActivationNames(strSet21);
        boolean boolean23 = compilerEnvirons20.isIdeMode();
        int int24 = compilerEnvirons20.getOptimizationLevel();
        compilerEnvirons20.setGeneratingSource(true);
        boolean boolean27 = compilerEnvirons20.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        boolean boolean18 = compilerEnvirons0.getWarnTrailingComma();
        int int19 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean22 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean12 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean6 = compilerEnvirons0.isGeneratingSource();
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 0);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setAllowSharpComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = compilerEnvirons9.isGenerateDebugInfo();
        compilerEnvirons9.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        boolean boolean24 = compilerEnvirons18.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons18.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons9.setAllowSharpComments(false);
        compilerEnvirons9.setGenerateObserverCount(true);
        java.util.Set<java.lang.String> strSet37 = compilerEnvirons9.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean39 = compilerEnvirons38.isGenerateDebugInfo();
        boolean boolean40 = compilerEnvirons38.isStrictMode();
        compilerEnvirons38.setAllowSharpComments(true);
        compilerEnvirons38.setReservedKeywordAsIdentifier(true);
        boolean boolean45 = compilerEnvirons38.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons46 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        compilerEnvirons46.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons46.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons54 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        compilerEnvirons54.setActivationNames((java.util.Set<java.lang.String>) strSet57);
        boolean boolean60 = compilerEnvirons54.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        compilerEnvirons54.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        compilerEnvirons46.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        com.google.javascript.rhino.head.ErrorReporter errorReporter69 = compilerEnvirons46.getErrorReporter();
        boolean boolean70 = compilerEnvirons46.reportWarningAsError();
        compilerEnvirons46.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons73 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray75 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        compilerEnvirons73.setActivationNames((java.util.Set<java.lang.String>) strSet76);
        boolean boolean79 = compilerEnvirons73.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons80 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray82 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet83 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet83, strArray82);
        compilerEnvirons80.setActivationNames((java.util.Set<java.lang.String>) strSet83);
        compilerEnvirons73.setActivationNames((java.util.Set<java.lang.String>) strSet83);
        compilerEnvirons46.setActivationNames((java.util.Set<java.lang.String>) strSet83);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet83);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet83);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet83);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(compilerEnvirons38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(errorReporter69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        boolean boolean10 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean12 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons0.getErrorReporter();
        boolean boolean23 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        java.lang.Class<?> wildcardClass30 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setStrictMode(true);
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
        boolean boolean23 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons9.setRecoverFromErrors(false);
        boolean boolean12 = compilerEnvirons9.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons9.getAllowSharpComments();
        boolean boolean14 = compilerEnvirons9.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean16 = compilerEnvirons15.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = compilerEnvirons17.isStrictMode();
        boolean boolean24 = compilerEnvirons17.isXmlAvailable();
        compilerEnvirons17.setGenerateObserverCount(true);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons17.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons17.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        compilerEnvirons37.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons37.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons45 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        boolean boolean51 = compilerEnvirons45.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons52 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        compilerEnvirons52.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons37.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        int int8 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean9 = compilerEnvirons8.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons8.setXmlAvailable(false);
        boolean boolean19 = compilerEnvirons8.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet21 = null;
        compilerEnvirons20.setActivationNames(strSet21);
        boolean boolean23 = compilerEnvirons20.isIdeMode();
        int int24 = compilerEnvirons20.getOptimizationLevel();
        compilerEnvirons20.setGeneratingSource(true);
        boolean boolean27 = compilerEnvirons20.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean37 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setWarnTrailingComma(true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean10 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        boolean boolean22 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setOptimizationLevel(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.Context context18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean7 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        java.lang.Class<?> wildcardClass7 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        compilerEnvirons0.setStrictMode(true);
        boolean boolean17 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        compilerEnvirons0.setAllowSharpComments(true);
        int int16 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        int int13 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setXmlAvailable(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        int int11 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.Context context3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = compilerEnvirons11.isStrictMode();
        boolean boolean18 = compilerEnvirons11.isXmlAvailable();
        compilerEnvirons11.setGenerateObserverCount(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        boolean boolean28 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons5.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons5.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons5.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons10.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setLanguageVersion((int) (short) 100);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean11 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        boolean boolean18 = compilerEnvirons0.isStrictMode();
        boolean boolean19 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        compilerEnvirons9.setXmlAvailable(false);
        compilerEnvirons9.setGenerateDebugInfo(true);
        boolean boolean22 = compilerEnvirons9.isXmlAvailable();
        compilerEnvirons9.setRecordingComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons25.setGenerateObserverCount(true);
        compilerEnvirons25.setWarnTrailingComma(true);
        boolean boolean35 = compilerEnvirons25.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet37 = null;
        compilerEnvirons36.setActivationNames(strSet37);
        java.util.Set<java.lang.String> strSet39 = compilerEnvirons36.getActivationNames();
        boolean boolean40 = compilerEnvirons36.isGenerateObserverCount();
        boolean boolean41 = compilerEnvirons36.isReservedKeywordAsIdentifier();
        boolean boolean42 = compilerEnvirons36.recoverFromErrors();
        compilerEnvirons36.setOptimizationLevel(1);
        boolean boolean45 = compilerEnvirons36.isXmlAvailable();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(strSet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        com.google.javascript.rhino.head.Context context13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean10 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        boolean boolean15 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean9 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.util.Set<java.lang.String> strSet10 = null;
        compilerEnvirons0.setActivationNames(strSet10);
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons0.getActivationNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = strSet12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean10 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean11 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass12 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setStrictMode(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        compilerEnvirons0.setGenerateObserverCount(false);
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        boolean boolean14 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGeneratingSource(false);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

