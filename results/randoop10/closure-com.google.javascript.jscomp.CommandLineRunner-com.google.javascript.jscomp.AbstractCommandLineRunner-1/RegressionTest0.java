import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.logging.Level level0 = null;
        com.google.javascript.jscomp.Compiler.setLoggingLevel(level0);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str0 = com.google.javascript.jscomp.Compiler.getReleaseVersion();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unversioned directory" + "'", str0, "Unversioned directory");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("Unversioned directory", "hi!", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader3 = sourceFile1.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("", charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.String str7 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile2 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile2 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(jSSourceFileArray1, jSSourceFileArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray1);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSError jSError1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel2 = compiler0.getErrorLevel(jSError1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException: ", reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray4 = new com.google.javascript.jscomp.JSModule[] { jSModule3 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray2, jSModuleArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
        org.junit.Assert.assertNotNull(jSModuleArray4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray2 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result4 = compiler0.compile(jSSourceFileArray1, jSModuleArray2, compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray1);
        org.junit.Assert.assertNotNull(jSModuleArray2);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setState(intermediateState1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = sourceFile1.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile(file0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("java.io.IOException: ", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: ", "Unversioned directory", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = compiler0.parse(sourceFile2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable5 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JsAst jsAst1 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("", throwable2);
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("", throwable5);
        iOException3.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: " + "'", str9, "java.io.IOException: ");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.MOTION_ITERATIONS_ERROR;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = compiler0.toSource(jSModule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.jscomp.ErrorManager errorManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(errorManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSError jSError3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str0 = com.google.javascript.jscomp.Compiler.getReleaseDate();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "2019/07/12 07:12" + "'", str0, "2019/07/12 07:12");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = sourceFile1.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.Compiler.OPTIMIZE_LOOP_ERROR;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray2 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray3 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result5 = compiler0.compile(jSSourceFileArray2, jSModuleArray3, compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSSourceFileArray2);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = builder0.buildFromFile(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromInputStream("", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        java.nio.charset.Charset charset3 = null;
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset3);
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str7 = sourceFile6.getOriginalPath();
        java.lang.String str9 = sourceFile6.getLine(0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(sourceFile4, sourceFile6, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Unversioned directory");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "hi!", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "2019/07/12 07:12", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromReader("Unversioned directory", reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("Unversioned directory", "java.io.IOException: ", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sourceFile3.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile7 = builder5.buildFromFile(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region4 = compiler1.getSourceRegion("2019/07/12 07:12", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader9 = sourceFile8.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PassConfig passConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("", "Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Unversioned directory");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.ErrorManager errorManager7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setErrorManager(errorManager7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region5 = sourceFile3.getRegion((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.rhino.InputId inputId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getInput(inputId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = compiler1.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel4 = compiler0.getErrorLevel(jSError3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "java.io.IOException: ", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_USELESS_CODE;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_MESSAGE = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler0.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = sourceFile2.getColumnOfOffset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray3 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray4 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result6 = compiler0.compile(jSSourceFileArray3, jSModuleArray4, compilerOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray3);
        org.junit.Assert.assertNotNull(jSModuleArray4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder10 = builder5.withCharset(charset9);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = builder5.buildFromInputStream("", inputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(outputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JsAst jsAst2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("", generator1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile11 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile11 };
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile13 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result16 = compiler0.compile(jSSourceFileArray12, jSSourceFileArray14, compilerOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        boolean boolean9 = sourceFile8.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Generator generator5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = builder0.buildFromGenerator("hi!", generator5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sourceFile6.getLine((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(sourceFile6);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.SourceFile.Builder builder2 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = builder2.buildFromGenerator("hi!", generator4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder2.buildFromGenerator("hi!", generator7);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile9 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result12 = compiler1.compile(sourceFile8, jSSourceFileArray10, compilerOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromReader("hi!", reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("2019/07/12 07:12", "2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        java.lang.String str3 = compiler0.getAstDotGraph();
        java.nio.charset.Charset charset5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset5);
        sourceFile6.setOriginalPath("hi!");
        sourceFile6.setOriginalPath("");
        sourceFile6.setOriginalPath("");
        java.lang.String str14 = sourceFile6.getLine((int) 'a');
        boolean boolean15 = sourceFile6.isExtern();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        compiler16.reportCodeChange();
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.SourceFile sourceFile21 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset20);
        sourceFile21.setOriginalPath("hi!");
        java.lang.String str24 = sourceFile21.getName();
        com.google.javascript.rhino.Node node25 = null; // flaky: compiler16.parse(sourceFile21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result27 = compiler0.compile(sourceFile6, sourceFile21, compilerOptions26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream3 = new java.io.PrintStream(outputStream0, false, "2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.hasErrors();
        com.google.javascript.rhino.InputId inputId11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.getInput(inputId11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromInputStream("Unversioned directory", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Generator generator5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = builder0.buildFromGenerator("hi!", generator5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = sourceFile6.getRegion((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(sourceFile6);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFileArray6, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("java.io.IOException: ");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: java.io.IOException:  (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = sourceFile8.getColumnOfOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 2019/07/12 07:12 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray6 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result8 = compiler0.compile(jSSourceFile5, jSModuleArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSModuleArray6);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            compiler1.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder3, (-1), node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        int int6 = sourceFile2.getLineOfOffset((-1));
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] { jSModule6 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.compile(jSSourceFileArray5, jSModuleArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSModuleArray7);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.ErrorManager errorManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setErrorManager(errorManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile6 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile6 };
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray9 = new com.google.javascript.jscomp.JSModule[] { jSModule8 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray7, jSModuleArray9, compilerOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSModuleArray9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setErrorManager(errorManager6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: the error manager cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder9.withOriginalPath("2019/07/12 07:12");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = builder11.buildFromFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        double double4 = compiler0.getProgress();
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = compiler0.toSource(jSModule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile4 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region5 = sourceFile3.getRegion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("", "2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: ", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel7 = compiler0.getErrorLevel(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile6 = builder0.buildFromReader("java.io.IOException", reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = sourceFile8.getColumnOfOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray6, jSSourceFileArray7, compilerOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.jscomp.JSError jSError5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(performanceTracker4);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.SourceFile.Builder builder11 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator13 = null;
        com.google.javascript.jscomp.SourceFile sourceFile14 = builder11.buildFromGenerator("hi!", generator13);
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder16 = builder11.withCharset(charset15);
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder18 = builder11.withCharset(charset17);
        com.google.javascript.jscomp.SourceFile.Builder builder20 = builder11.withOriginalPath("hi!");
        com.google.javascript.jscomp.SourceFile sourceFile22 = builder11.buildFromFile("Unversioned directory");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = compiler0.parse(sourceFile22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(sourceFile22);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.io.IOException iOException1 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: 2019/07/12 07:12" + "'", str3, "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile5 };
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] { jSModule7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray6, jSModuleArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSModuleArray8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFileArray6, jSSourceFileArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile jSSourceFile7 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile7 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result10 = compiler0.compile(jSSourceFileArray6, jSSourceFileArray8, compilerOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.JSError jSError2 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.report(jSError2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset7);
        sourceFile8.setOriginalPath("hi!");
        sourceFile8.setOriginalPath("");
        java.lang.String str13 = sourceFile8.getOriginalPath();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result19 = compiler0.compile(sourceFile8, sourceFile17, compilerOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel12 = compiler0.getErrorLevel(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromReader("java.io.IOException", reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.init(jSSourceFileArray5, jSSourceFileArray6, compilerOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(performanceTracker4);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.initOptions(compilerOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.io.IOException iOException2 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException3 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: Unversioned directory" + "'", str4, "java.io.IOException: Unversioned directory");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler0.toSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        int int6 = sourceFile2.getLineOfOffset((int) (short) 10);
        java.lang.String str7 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("Unversioned directory", "2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(performanceTracker4);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.parallelStream();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        double double5 = compiler4.getProgress();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromInputStream("2019/07/12 07:12", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor4 = locationMappingList1.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile3 = null;
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] { jSModule4 };
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setLabelRenaming(true);
        compilerOptions6.setCheckMissingGetCssNameBlacklist("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result11 = compiler0.compile(jSSourceFile3, jSModuleArray5, compilerOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(jSModuleArray5);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler3.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping13 = locationMappingList9.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.setOriginalPath("");
        java.lang.String str7 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader8 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach10 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions6.setInlineVariables(reach10);
        compilerOptions6.setPrintInputDelimiter(true);
        boolean boolean14 = compilerOptions6.closurePass;
        compilerOptions6.setOutputCharset("java.io.IOException");
// flaky:         compiler0.init(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.RuntimeException: java.nio.charset.UnsupportedCharsetException: java.io.IOException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
// flaky:         org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + reach10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach10.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: Unversioned directory", "2019/07/12 07:12", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSError jSError8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(sourceMap5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(sourceMap7);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.replaceAll(locationMappingUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Generator generator11 = null;
        com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromGenerator("java.io.IOException: ", generator11);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = builder9.buildFromReader("java.io.IOException", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = false;
        boolean boolean13 = compilerOptions0.getInferTypes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList31 = locationMappingList1.subList((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str12 = codeBuilder11.toString();
        int int13 = codeBuilder11.getLength();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        compiler15.reportCodeChange();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset19);
        sourceFile20.setOriginalPath("hi!");
        java.lang.String str23 = sourceFile20.getName();
        com.google.javascript.rhino.Node node24 = null; // flaky: compiler15.parse(sourceFile20);
// flaky:         compiler0.toSource(codeBuilder11, 0, node24);
        com.google.javascript.jscomp.JsAst jsAst26 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = locationMappingList1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.WarningsGuard warningsGuard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream10 = new java.io.PrintStream("Unversioned directory");
        char[] charArray13 = new char[] { '4', '4' };
        printStream10.print(charArray13);
        printStream1.println(charArray13);
        java.util.Locale locale16 = null;
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup21 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup21;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder24 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator26 = null;
        com.google.javascript.jscomp.SourceFile sourceFile27 = builder24.buildFromGenerator("hi!", generator26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { diagnosticGroup21, diagnosticGroup23, sourceFile27 };
        java.io.PrintStream printStream29 = printStream19.printf("2019/07/12 07:12", objArray28);
        java.io.PrintStream printStream32 = new java.io.PrintStream("Unversioned directory");
        char[] charArray35 = new char[] { '4', '4' };
        printStream32.print(charArray35);
        printStream32.print((int) ' ');
        java.io.PrintStream printStream40 = new java.io.PrintStream((java.io.OutputStream) printStream32, false);
        printStream32.write((int) '#');
        java.util.Locale locale43 = null;
        java.lang.Object[] objArray46 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream47 = printStream32.format(locale43, "Unversioned directory", objArray46);
        java.io.PrintStream printStream48 = printStream29.format("hi!", objArray46);
        java.io.PrintStream printStream49 = printStream1.printf(locale16, "java.io.IOException: ", objArray46);
        printStream1.print((double) (-1L));
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4]");
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup21);
        org.junit.Assert.assertNotNull(diagnosticGroup23);
        org.junit.Assert.assertNotNull(sourceFile27);
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream47);
        org.junit.Assert.assertNotNull(printStream48);
        org.junit.Assert.assertNotNull(printStream49);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup6 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup6;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        boolean boolean11 = compilerOptions8.extractPrototypeMemberDeclarations;
        compilerOptions8.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel14 = compilerOptions8.brokenClosureRequiresLevel;
        compilerOptions0.setWarningLevel(diagnosticGroup6, checkLevel14);
        compilerOptions0.crossModuleCodeMotion = false;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(diagnosticGroup6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + checkLevel14 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel14.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.io.IOException iOException2 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException3 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str6 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: java.io.IOException: 2019/07/12 07:12" + "'", str6, "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Generator generator11 = null;
        com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromGenerator("java.io.IOException: ", generator11);
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder14 = builder9.withCharset(charset13);
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = builder14.buildFromInputStream("", inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("", throwable9);
        java.lang.Throwable throwable12 = null;
        java.io.IOException iOException13 = new java.io.IOException("", throwable12);
        iOException10.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException10);
        iOException5.addSuppressed((java.lang.Throwable) iOException15);
        java.lang.String str17 = iOException15.toString();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: " + "'", str17, "java.io.IOException: ");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromReader("", reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.JsAst jsAst10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.aggressiveVarCheck;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setDependencyOptions(dependencyOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        compilerOptions0.setProtectHiddenSideEffects(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.lang.Throwable throwable21 = null;
        java.io.IOException iOException22 = new java.io.IOException("", throwable21);
        java.lang.Throwable throwable24 = null;
        java.io.IOException iOException25 = new java.io.IOException("", throwable24);
        iOException22.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException22);
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        java.io.PrintStream printStream29 = printStream1.format("java.io.IOException: Unversioned directory", (java.lang.Object[]) throwableArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream33 = printStream1.append((java.lang.CharSequence) "", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(printStream29);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        compiler7.reportCodeChange();
        java.lang.String str10 = compiler7.getAstDotGraph();
        com.google.javascript.rhino.Node node11 = compiler7.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler7.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager13 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler7.getState();
        compiler0.setState(intermediateState14);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(sourceMap5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(sourceMap12);
// flaky:         org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(intermediateState14);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing0 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean1 = tweakProcessing0.shouldStrip();
        java.lang.Class<?> wildcardClass2 = tweakProcessing0.getClass();
        org.junit.Assert.assertTrue("'" + tweakProcessing0 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing0.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.IOException iOException21 = new java.io.IOException("Unversioned directory");
        printStream1.print((java.lang.Object) "Unversioned directory");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup18);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping31 = locationMappingList1.set((int) (short) 0, locationMapping30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList28 = locationMappingList9.subList((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        char[] charArray24 = new char[] { ' ', '#', '4', 'a', '#', 'a' };
        printStream1.print(charArray24);
        java.lang.CharSequence charSequence26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream29 = printStream1.append(charSequence26, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " #4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " #4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , #, 4, a, #, a]");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = compiler0.toSourceArray(jSModule1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker6 = null;
        compiler0.tracker = performanceTracker6;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str26 = sourceFile25.getOriginalPath();
        java.lang.String str28 = sourceFile25.getLine(0);
        sourceFile25.setOriginalPath("");
        boolean boolean31 = sourceFile25.isExtern();
        com.google.javascript.jscomp.SourceFile sourceFile32 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention36 = null;
        compilerOptions33.setCodingConvention(codingConvention36);
        compilerOptions33.setGeneratePseudoNames(true);
        compilerOptions33.inlineLocalFunctions = false;
        compilerOptions33.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        boolean boolean47 = compilerOptions44.extractPrototypeMemberDeclarations;
        compilerOptions44.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = null;
        compilerOptions50.setCodingConvention(codingConvention53);
        compilerOptions50.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel57 = compilerOptions50.checkProvides;
        compilerOptions44.setReportUnknownTypes(checkLevel57);
        compilerOptions33.setCheckGlobalNamesLevel(checkLevel57);
        compilerOptions33.checkMissingGetCssNameBlacklist = "";
        compilerOptions33.setLineBreak(true);
        boolean boolean64 = compilerOptions33.deadAssignmentElimination;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result65 = compiler12.compile(sourceFile25, sourceFile32, compilerOptions33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sourceFile25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + checkLevel57 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel57.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        int int5 = sourceFile3.getLineOffset(1);
        boolean boolean6 = sourceFile3.isExtern();
        java.lang.String str7 = sourceFile3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region9 = sourceFile3.getRegion((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            printStream11.write(byteArray14, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup3);
        org.junit.Assert.assertNotNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 0]");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.WarningsGuard warningsGuard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        double double6 = compiler5.getProgress();
        compiler5.reportCodeChange();
        java.lang.String str8 = compiler5.getAstDotGraph();
        com.google.javascript.rhino.Node node9 = compiler5.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler5.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager11 = null; // flaky: compiler5.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler5.getState();
        compiler1.setState(intermediateState12);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(sourceMap10);
// flaky:         org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState12);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str12 = codeBuilder11.toString();
        int int13 = codeBuilder11.getLength();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        compiler15.reportCodeChange();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset19);
        sourceFile20.setOriginalPath("hi!");
        java.lang.String str23 = sourceFile20.getName();
        com.google.javascript.rhino.Node node24 = null; // flaky: compiler15.parse(sourceFile20);
// flaky:         compiler0.toSource(codeBuilder11, 0, node24);
        com.google.javascript.jscomp.JSError jSError26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel27 = compiler0.getErrorLevel(jSError26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState7 = compiler0.getState();
        com.google.javascript.jscomp.PassConfig passConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(intermediateState7);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        java.lang.Class<?> wildcardClass12 = compilerOptions0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = compiler0.toSourceArray(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.isExternExportsEnabled();
        boolean boolean6 = compilerOptions0.aliasKeywords;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.replaceAll(locationMappingUnaryOperator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.acceptEcmaScript5();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder0.withCharset(charset10);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = builder11.buildFromInputStream("", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = compiler1.isIdeMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder2 = builder0.withCharset(charset1);
        com.google.javascript.jscomp.SourceFile sourceFile5 = builder0.buildFromCode("Unversioned directory", "Unversioned directory");
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile8 = builder0.buildFromReader("", reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(sourceFile5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions17.checkProvides;
        compilerOptions11.setReportUnknownTypes(checkLevel24);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel24);
        compilerOptions0.checkMissingGetCssNameBlacklist = "";
        compilerOptions0.setLineBreak(true);
        boolean boolean31 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.preferLineBreakAtEndOfFile = false;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        boolean boolean8 = compilerOptions0.preferLineBreakAtEndOfFile;
        java.lang.String str9 = compilerOptions0.aliasStringsBlacklist;
        com.google.javascript.jscomp.WarningsGuard warningsGuard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException: ");
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions0.aggressiveVarCheck;
        compilerOptions0.removeTryCatchFinally = true;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        compiler14.reportCodeChange();
        com.google.javascript.rhino.Node node17 = compiler14.getRoot();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        compiler18.reportCodeChange();
        com.google.javascript.jscomp.Scope scope21 = compiler18.getTopScope();
        compiler18.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        compiler14.setState(intermediateState23);
        com.google.javascript.jscomp.ErrorManager errorManager25 = null; // flaky: compiler14.getErrorManager();
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNotNull(intermediateState23);
// flaky:         org.junit.Assert.assertNotNull(errorManager25);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        compilerOptions44.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions44.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        compilerOptions44.sourceMapLocationMappings = locationMappingList53;
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions44.aggressiveVarCheck;
        compilerOptions39.checkProvides = checkLevel56;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap58 = null;
        compilerOptions39.setCssRenamingMap(cssRenamingMap58);
        compilerOptions39.setAliasAllStrings(false);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.optimizeParameters = false;
        compilerOptions0.closurePass = true;
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.printInputDelimiter = false;
        compilerOptions0.setCheckSymbols(true);
        compilerOptions0.removeUnusedLocalVars = false;
        boolean boolean12 = compilerOptions0.jqueryPass;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        boolean boolean8 = compilerOptions0.checkTypes;
        compilerOptions0.setGenerateExports(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        double double3 = compiler2.getProgress();
        compiler2.reportCodeChange();
        java.lang.String str5 = compiler2.getAstDotGraph();
        com.google.javascript.rhino.Node node6 = compiler2.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler2.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager8 = null; // flaky: compiler2.getErrorManager();
// flaky:         compiler1.setErrorManager(errorManager8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode10 = compiler1.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(sourceMap7);
// flaky:         org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler0.acceptConstKeyword();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention11 = null;
        compilerOptions8.setCodingConvention(codingConvention11);
        compilerOptions8.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions8.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        compilerOptions8.sourceMapLocationMappings = locationMappingList17;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        compiler20.reportCodeChange();
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset24);
        sourceFile25.setOriginalPath("hi!");
        java.lang.String str28 = sourceFile25.getName();
        com.google.javascript.rhino.Node node29 = null; // flaky: compiler20.parse(sourceFile25);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter30 = null; // flaky: compiler20.getReverseAbstractInterpreter();
        boolean boolean31 = locationMappingList17.remove((java.lang.Object) compiler20);
        int int33 = locationMappingList17.indexOf((java.lang.Object) (-1.0d));
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        boolean boolean37 = compilerOptions34.extractPrototypeMemberDeclarations;
        boolean boolean38 = compilerOptions34.jqueryPass;
        compilerOptions34.setClosurePass(true);
        int int41 = locationMappingList17.lastIndexOf((java.lang.Object) true);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing42 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean43 = tweakProcessing42.shouldStrip();
        java.lang.Class<?> wildcardClass44 = tweakProcessing42.getClass();
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing45 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean46 = tweakProcessing45.shouldStrip();
        java.lang.Class<?> wildcardClass47 = tweakProcessing45.getClass();
        java.lang.reflect.Type[] typeArray48 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass47 };
        java.lang.reflect.Type[] typeArray49 = locationMappingList17.toArray(typeArray48);
        printStream1.println((java.lang.Object) locationMappingList17);
        java.util.Collection<java.lang.String> strCollection51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = locationMappingList17.containsAll(strCollection51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node29);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + tweakProcessing42 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing42.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + tweakProcessing45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing45.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = compiler0.getSourceLine("java.io.IOException", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        java.lang.String str12 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError jSError13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel14 = compiler0.getErrorLevel(jSError13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        boolean boolean29 = compilerOptions26.extractPrototypeMemberDeclarations;
        boolean boolean30 = compilerOptions26.jqueryPass;
        compilerOptions26.setClosurePass(true);
        int int33 = locationMappingList9.lastIndexOf((java.lang.Object) true);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing34 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean35 = tweakProcessing34.shouldStrip();
        java.lang.Class<?> wildcardClass36 = tweakProcessing34.getClass();
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing37 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean38 = tweakProcessing37.shouldStrip();
        java.lang.Class<?> wildcardClass39 = tweakProcessing37.getClass();
        java.lang.reflect.Type[] typeArray40 = new java.lang.reflect.Type[] { wildcardClass36, wildcardClass39 };
        java.lang.reflect.Type[] typeArray41 = locationMappingList9.toArray(typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = locationMappingList9.subList((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + tweakProcessing34 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing34.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + tweakProcessing37 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing37.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        compiler0.disableThreads();
        java.io.PrintStream printStream6 = new java.io.PrintStream("Unversioned directory");
        char[] charArray9 = new char[] { '4', '4' };
        printStream6.print(charArray9);
        printStream6.print((int) ' ');
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream6.write(byteArray19, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup23 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream6.println((java.lang.Object) diagnosticGroup23);
        java.io.PrintStream printStream25 = new java.io.PrintStream((java.io.OutputStream) printStream6);
        java.io.PrintStream printStream27 = printStream6.append((java.lang.CharSequence) "");
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        double double30 = compiler29.getProgress();
        compiler29.reportCodeChange();
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.SourceFile sourceFile34 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset33);
        sourceFile34.setOriginalPath("hi!");
        java.lang.String str37 = sourceFile34.getName();
        com.google.javascript.rhino.Node node38 = null; // flaky: compiler29.parse(sourceFile34);
        boolean boolean39 = false; // flaky: compiler29.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        double double43 = compiler42.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager44 = null; // flaky: compiler42.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager45 = null; // flaky: compiler42.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray46 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        boolean boolean51 = compilerOptions48.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach52 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions48.setInlineVariables(reach52);
        compilerOptions48.setPrintInputDelimiter(true);
        boolean boolean56 = compilerOptions48.closurePass;
        compilerOptions48.setOutputCharset("java.io.IOException");
// flaky:         compiler42.init(jSSourceFileArray46, jSSourceFileArray47, compilerOptions48);
// flaky:         compiler29.init(jSSourceFileArray40, jSModuleArray41, compilerOptions48);
        java.io.PrintStream printStream61 = printStream27.printf("", (java.lang.Object[]) jSSourceFileArray40);
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        double double63 = compiler62.getProgress();
        compiler62.reportCodeChange();
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.SourceFile sourceFile67 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset66);
        sourceFile67.setOriginalPath("hi!");
        java.lang.String str70 = sourceFile67.getName();
        com.google.javascript.rhino.Node node71 = null; // flaky: compiler62.parse(sourceFile67);
        boolean boolean72 = false; // flaky: compiler62.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray73 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray74 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        double double76 = compiler75.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager77 = null; // flaky: compiler75.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager78 = null; // flaky: compiler75.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray79 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray80 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions81.setRewriteNewDateGoogNow(true);
        boolean boolean84 = compilerOptions81.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach85 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions81.setInlineVariables(reach85);
        compilerOptions81.setPrintInputDelimiter(true);
        boolean boolean89 = compilerOptions81.closurePass;
        compilerOptions81.setOutputCharset("java.io.IOException");
// flaky:         compiler75.init(jSSourceFileArray79, jSSourceFileArray80, compilerOptions81);
// flaky:         compiler62.init(jSSourceFileArray73, jSModuleArray74, compilerOptions81);
        com.google.javascript.jscomp.CompilerOptions compilerOptions94 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet95 = compilerOptions94.stripNamePrefixes;
        byte[] byteArray96 = compilerOptions94.inputVariableMapSerialized;
        compilerOptions94.checkSymbols = false;
        com.google.javascript.jscomp.Result result99 = null; // flaky: compiler0.compile(jSSourceFileArray40, jSModuleArray74, compilerOptions94);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup23);
        org.junit.Assert.assertNotNull(printStream27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node38);
// flaky:         org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager44);
// flaky:         org.junit.Assert.assertNotNull(errorManager45);
        org.junit.Assert.assertNotNull(jSSourceFileArray46);
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + reach52 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach52.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(printStream61);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node71);
// flaky:         org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray73);
        org.junit.Assert.assertNotNull(jSModuleArray74);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager77);
// flaky:         org.junit.Assert.assertNotNull(errorManager78);
        org.junit.Assert.assertNotNull(jSSourceFileArray79);
        org.junit.Assert.assertNotNull(jSSourceFileArray80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + reach85 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach85.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(byteArray96);
// flaky:         org.junit.Assert.assertNotNull(result99);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        double double5 = compiler4.getProgress();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.ErrorManager errorManager11 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
// flaky:         org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(intermediateState12);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        com.google.javascript.jscomp.DependencyOptions dependencyOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setDependencyOptions(dependencyOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        com.google.javascript.rhino.Node node6 = null; // flaky: compiler2.parse(sourceFile4);
        double double7 = compiler2.getProgress();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler2.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.Scope scope16 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
// flaky:         compiler0.check();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = null; // flaky: compiler0.getCodingConvention();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(codingConvention7);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        java.io.PrintStream printStream8 = null;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(printStream8);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler9.getState();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager13 = null; // flaky: compiler11.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager14 = null; // flaky: compiler11.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach21 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions17.setInlineVariables(reach21);
        compilerOptions17.setPrintInputDelimiter(true);
        boolean boolean25 = compilerOptions17.closurePass;
        compilerOptions17.setOutputCharset("java.io.IOException");
// flaky:         compiler11.init(jSSourceFileArray15, jSSourceFileArray16, compilerOptions17);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        double double30 = compiler29.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager31 = null; // flaky: compiler29.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager32 = null; // flaky: compiler29.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        boolean boolean38 = compilerOptions35.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach39 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions35.setInlineVariables(reach39);
        compilerOptions35.setPrintInputDelimiter(true);
        boolean boolean43 = compilerOptions35.closurePass;
        compilerOptions35.setOutputCharset("java.io.IOException");
// flaky:         compiler29.init(jSSourceFileArray33, jSSourceFileArray34, compilerOptions35);
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setInlineConstantVars(true);
// flaky:         compiler9.init(jSSourceFileArray15, jSSourceFileArray33, compilerOptions47);
        boolean boolean51 = compilerOptions47.aliasKeywords;
        compilerOptions47.setInlineGetters(false);
        java.util.Set<java.lang.String> strSet54 = compilerOptions47.aliasableStrings;
        compilerOptions0.stripTypes = strSet54;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager13);
// flaky:         org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + reach21 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach21.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager31);
// flaky:         org.junit.Assert.assertNotNull(errorManager32);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + reach39 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach39.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet54);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        int int4 = sourceFile2.getColumnOfOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sourceFile2.getCode();
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.rhino.InputId inputId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getInput(inputId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        compilerOptions0.printInputDelimiter = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setPropertyInvalidationErrors(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.checkGlobalNamesLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        compilerOptions13.sourceMapLocationMappings = locationMappingList22;
        java.lang.Object[] objArray25 = locationMappingList22.toArray();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor27 = locationMappingList22.listIterator(0);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        double double29 = compiler28.getProgress();
        compiler28.reportCodeChange();
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.SourceFile sourceFile33 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset32);
        sourceFile33.setOriginalPath("hi!");
        java.lang.String str36 = sourceFile33.getName();
        com.google.javascript.rhino.Node node37 = null; // flaky: compiler28.parse(sourceFile33);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter38 = null; // flaky: compiler28.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler28.tracker;
        boolean boolean40 = locationMappingList22.equals((java.lang.Object) compiler28);
        compilerOptions0.sourceMapLocationMappings = locationMappingList22;
        java.util.Iterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor42 = locationMappingList22.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(locationMappingItor27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node37);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter38);
        org.junit.Assert.assertNull(performanceTracker39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locationMappingItor42);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        compilerOptions39.setInlineGetters(false);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing46 = compilerOptions39.getTweakProcessing();
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing46.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        java.lang.String[] strArray28 = new java.lang.String[] { "2019/07/12 07:12", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        boolean boolean37 = compilerOptions32.generateExports;
        compilerOptions32.gatherCssNames = false;
        boolean boolean40 = compilerOptions32.optimizeReturns;
        compilerOptions32.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        compilerOptions44.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions44.checkProvides;
        java.lang.String[] strArray53 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        compilerOptions44.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList54.stream();
        compilerOptions32.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList54);
        boolean boolean59 = locationMappingList9.removeAll((java.util.Collection<java.lang.String>) strList54);
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList9.replaceAll(locationMappingUnaryOperator60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strStream57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        java.lang.String[] strArray28 = new java.lang.String[] { "2019/07/12 07:12", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        boolean boolean37 = compilerOptions32.generateExports;
        compilerOptions32.gatherCssNames = false;
        boolean boolean40 = compilerOptions32.optimizeReturns;
        compilerOptions32.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        compilerOptions44.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions44.checkProvides;
        java.lang.String[] strArray53 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        compilerOptions44.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList54.stream();
        compilerOptions32.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList54);
        boolean boolean59 = locationMappingList9.removeAll((java.util.Collection<java.lang.String>) strList54);
        java.lang.Object obj60 = null;
        int int61 = locationMappingList9.indexOf(obj60);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strStream57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setLabelRenaming(true);
        compilerOptions12.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions12.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap19 = compilerOptions12.cssRenamingMap;
// flaky:         compiler0.initOptions(compilerOptions12);
// flaky:         compiler0.check();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(cssRenamingMap19);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream22 = printStream1.append((java.lang.CharSequence) "");
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        double double25 = compiler24.getProgress();
        compiler24.reportCodeChange();
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.SourceFile sourceFile29 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset28);
        sourceFile29.setOriginalPath("hi!");
        java.lang.String str32 = sourceFile29.getName();
        com.google.javascript.rhino.Node node33 = null; // flaky: compiler24.parse(sourceFile29);
        boolean boolean34 = false; // flaky: compiler24.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray36 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        double double38 = compiler37.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager39 = null; // flaky: compiler37.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager40 = null; // flaky: compiler37.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions43.setRewriteNewDateGoogNow(true);
        boolean boolean46 = compilerOptions43.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach47 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions43.setInlineVariables(reach47);
        compilerOptions43.setPrintInputDelimiter(true);
        boolean boolean51 = compilerOptions43.closurePass;
        compilerOptions43.setOutputCharset("java.io.IOException");
// flaky:         compiler37.init(jSSourceFileArray41, jSSourceFileArray42, compilerOptions43);
// flaky:         compiler24.init(jSSourceFileArray35, jSModuleArray36, compilerOptions43);
        java.io.PrintStream printStream56 = printStream22.printf("", (java.lang.Object[]) jSSourceFileArray35);
        java.io.PrintStream printStream57 = new java.io.PrintStream((java.io.OutputStream) printStream22);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup18);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node33);
// flaky:         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray35);
        org.junit.Assert.assertNotNull(jSModuleArray36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager39);
// flaky:         org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + reach47 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach47.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(printStream56);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        boolean boolean3 = sourceFile1.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = sourceFile1.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        compilerOptions0.setDefineToNumberLiteral("java.io.IOException: ", 100);
        compilerOptions0.labelRenaming = true;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        int int11 = 0; // flaky: compiler0.getWarningCount();
        com.google.javascript.rhino.InputId inputId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.getInput(inputId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setIgnoreCajaProperties(false);
        compilerOptions0.setRewriteFunctionExpressions(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        java.lang.Object[] objArray12 = locationMappingList9.toArray();
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList9.replaceAll(locationMappingUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        com.google.javascript.jscomp.JsAst jsAst12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap4 = compiler1.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager20 = null; // flaky: compiler18.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager21 = null; // flaky: compiler18.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach28 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions24.setInlineVariables(reach28);
        compilerOptions24.setPrintInputDelimiter(true);
        boolean boolean32 = compilerOptions24.closurePass;
        compilerOptions24.setOutputCharset("java.io.IOException");
// flaky:         compiler18.init(jSSourceFileArray22, jSSourceFileArray23, compilerOptions24);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        double double37 = compiler36.getProgress();
        compiler36.reportCodeChange();
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.SourceFile sourceFile41 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset40);
        sourceFile41.setOriginalPath("hi!");
        java.lang.String str44 = sourceFile41.getName();
        com.google.javascript.rhino.Node node45 = null; // flaky: compiler36.parse(sourceFile41);
        boolean boolean46 = false; // flaky: compiler36.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager52 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach59 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions55.setInlineVariables(reach59);
        compilerOptions55.setPrintInputDelimiter(true);
        boolean boolean63 = compilerOptions55.closurePass;
        compilerOptions55.setOutputCharset("java.io.IOException");
// flaky:         compiler49.init(jSSourceFileArray53, jSSourceFileArray54, compilerOptions55);
// flaky:         compiler36.init(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setRewriteNewDateGoogNow(true);
        boolean boolean71 = compilerOptions68.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach72 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions68.setInlineVariables(reach72);
        boolean boolean74 = compilerOptions68.removeUnusedVars;
        com.google.javascript.jscomp.Result result75 = null; // flaky: compiler17.compile(jSSourceFileArray23, jSModuleArray48, compilerOptions68);
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = null; // flaky: compiler17.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            compiler17.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager20);
// flaky:         org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + reach28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach28.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node45);
// flaky:         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
// flaky:         org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + reach59 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach59.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + reach72 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach72.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky:         org.junit.Assert.assertNotNull(result75);
// flaky:         org.junit.Assert.assertNotNull(jSErrorArray76);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler4 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
// flaky:         org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = sourceFile8.getLineOfOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.stream.Stream<java.lang.String> strStream29 = strSet26.stream();
        java.util.stream.Stream<java.lang.String> strStream30 = strSet26.stream();
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strStream29);
        org.junit.Assert.assertNotNull(strStream30);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        boolean boolean3 = false; // flaky: compiler0.acceptConstKeyword();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing8 = compilerOptions0.getTweakProcessing();
        boolean boolean9 = tweakProcessing8.shouldStrip();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing8 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing8.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        boolean boolean5 = false; // flaky: compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.PassConfig passConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        compilerOptions0.setLanguageIn(languageMode4);
        compilerOptions0.setInlineVariables(false);
        boolean boolean8 = compilerOptions0.lineBreak;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + languageMode4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT + "'", languageMode4.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        boolean boolean11 = false; // flaky: compiler0.hasErrors();
        int int12 = 0; // flaky: compiler0.getWarningCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager20 = null; // flaky: compiler18.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager21 = null; // flaky: compiler18.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach28 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions24.setInlineVariables(reach28);
        compilerOptions24.setPrintInputDelimiter(true);
        boolean boolean32 = compilerOptions24.closurePass;
        compilerOptions24.setOutputCharset("java.io.IOException");
// flaky:         compiler18.init(jSSourceFileArray22, jSSourceFileArray23, compilerOptions24);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        double double37 = compiler36.getProgress();
        compiler36.reportCodeChange();
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.SourceFile sourceFile41 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset40);
        sourceFile41.setOriginalPath("hi!");
        java.lang.String str44 = sourceFile41.getName();
        com.google.javascript.rhino.Node node45 = null; // flaky: compiler36.parse(sourceFile41);
        boolean boolean46 = false; // flaky: compiler36.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager52 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach59 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions55.setInlineVariables(reach59);
        compilerOptions55.setPrintInputDelimiter(true);
        boolean boolean63 = compilerOptions55.closurePass;
        compilerOptions55.setOutputCharset("java.io.IOException");
// flaky:         compiler49.init(jSSourceFileArray53, jSSourceFileArray54, compilerOptions55);
// flaky:         compiler36.init(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setRewriteNewDateGoogNow(true);
        boolean boolean71 = compilerOptions68.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach72 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions68.setInlineVariables(reach72);
        boolean boolean74 = compilerOptions68.removeUnusedVars;
        com.google.javascript.jscomp.Result result75 = null; // flaky: compiler17.compile(jSSourceFileArray23, jSModuleArray48, compilerOptions68);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable76 = compiler17.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager20);
// flaky:         org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + reach28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach28.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node45);
// flaky:         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
// flaky:         org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + reach59 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach59.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + reach72 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach72.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky:         org.junit.Assert.assertNotNull(result75);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        boolean boolean6 = compilerOptions0.closurePass;
        compilerOptions0.setAppNameStr("");
        compilerOptions0.enableExternExports(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler(printStream16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager20 = null; // flaky: compiler18.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager21 = null; // flaky: compiler18.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray23 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach28 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions24.setInlineVariables(reach28);
        compilerOptions24.setPrintInputDelimiter(true);
        boolean boolean32 = compilerOptions24.closurePass;
        compilerOptions24.setOutputCharset("java.io.IOException");
// flaky:         compiler18.init(jSSourceFileArray22, jSSourceFileArray23, compilerOptions24);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        double double37 = compiler36.getProgress();
        compiler36.reportCodeChange();
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.SourceFile sourceFile41 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset40);
        sourceFile41.setOriginalPath("hi!");
        java.lang.String str44 = sourceFile41.getName();
        com.google.javascript.rhino.Node node45 = null; // flaky: compiler36.parse(sourceFile41);
        boolean boolean46 = false; // flaky: compiler36.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager52 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach59 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions55.setInlineVariables(reach59);
        compilerOptions55.setPrintInputDelimiter(true);
        boolean boolean63 = compilerOptions55.closurePass;
        compilerOptions55.setOutputCharset("java.io.IOException");
// flaky:         compiler49.init(jSSourceFileArray53, jSSourceFileArray54, compilerOptions55);
// flaky:         compiler36.init(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setRewriteNewDateGoogNow(true);
        boolean boolean71 = compilerOptions68.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach72 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions68.setInlineVariables(reach72);
        boolean boolean74 = compilerOptions68.removeUnusedVars;
        com.google.javascript.jscomp.Result result75 = null; // flaky: compiler17.compile(jSSourceFileArray23, jSModuleArray48, compilerOptions68);
        java.lang.String str76 = compiler17.getAstDotGraph();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager20);
// flaky:         org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertNotNull(jSSourceFileArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + reach28 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach28.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node45);
// flaky:         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
// flaky:         org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + reach59 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach59.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + reach72 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach72.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky:         org.junit.Assert.assertNotNull(result75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping9 = locationMappingList1.set((int) '4', locationMapping8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        double double5 = compiler4.getProgress();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.ErrorManager errorManager11 = null; // flaky: compiler0.getErrorManager();
        int int12 = 0; // flaky: compiler0.getErrorCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
// flaky:         org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("2019/07/12 07:12", "java.io.IOException", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str7 = sourceFile6.getOriginalPath();
        java.lang.String str9 = sourceFile6.getLine(0);
        java.lang.String str10 = sourceFile6.getName();
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset12);
        sourceFile13.setOriginalPath("hi!");
        sourceFile13.setOriginalPath("");
        boolean boolean18 = sourceFile13.isExtern();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        compilerOptions19.setCodingConvention(codingConvention22);
        boolean boolean24 = compilerOptions19.generateExports;
        compilerOptions19.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy30 = compilerOptions27.variableRenaming;
        compilerOptions19.setVariableRenaming(variableRenamingPolicy30);
        com.google.javascript.jscomp.Result result32 = null; // flaky: compiler0.compile(sourceFile6, sourceFile13, compilerOptions19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput34 = compiler0.newExternInput("Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy30 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy30.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
// flaky:         org.junit.Assert.assertNotNull(result32);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str12 = codeBuilder11.toString();
        int int13 = codeBuilder11.getLength();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        compiler15.reportCodeChange();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset19);
        sourceFile20.setOriginalPath("hi!");
        java.lang.String str23 = sourceFile20.getName();
        com.google.javascript.rhino.Node node24 = null; // flaky: compiler15.parse(sourceFile20);
// flaky:         compiler0.toSource(codeBuilder11, 0, node24);
        com.google.javascript.jscomp.JSModule jSModule26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = compiler0.toSource(jSModule26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        java.io.PrintStream printStream3 = new java.io.PrintStream("Unversioned directory");
        char[] charArray6 = new char[] { '4', '4' };
        printStream3.print(charArray6);
        printStream1.print(charArray6);
        java.io.PrintStream printStream10 = new java.io.PrintStream((java.io.OutputStream) printStream1, true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream13 = new java.io.PrintStream((java.io.OutputStream) printStream1, true, "java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, 4]");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        int int4 = sourceFile2.getColumnOfOffset(10);
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader6 = sourceFile2.getCodeReader();
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        compilerOptions0.reserveRawExports = false;
        compilerOptions0.crossModuleCodeMotion = false;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.aggressiveVarCheck;
        java.lang.Class<?> wildcardClass11 = checkLevel10.getClass();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compilerOptions0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions7.setRewriteNewDateGoogNow(true);
        boolean boolean10 = compilerOptions7.extractPrototypeMemberDeclarations;
        compilerOptions7.convertToDottedProperties = true;
        boolean boolean13 = compilerOptions7.inlineConstantVars;
        compilerOptions7.aliasAllStrings = false;
        boolean boolean16 = compilerOptions7.smartNameRemoval;
        compilerOptions7.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions7.checkGlobalNamesLevel;
        compilerOptions0.setCheckProvides(checkLevel19);
        compilerOptions0.setSummaryDetailLevel(10);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.toString();
        java.lang.String str4 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        int int11 = 0; // flaky: compiler0.getWarningCount();
        java.lang.String str12 = null; // flaky: compiler0.toSource();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        java.lang.String[] strArray21 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        compilerOptions12.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList22);
        java.util.stream.Stream<java.lang.String> strStream25 = strList22.stream();
        compilerOptions0.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList22);
        compilerOptions0.setGeneratePseudoNames(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strStream25);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripTypes;
        boolean boolean9 = compilerOptions0.inlineFunctions;
        boolean boolean10 = compilerOptions0.inlineLocalFunctions;
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        double double5 = compiler4.getProgress();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.ErrorManager errorManager11 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = null; // flaky: compiler0.getWarnings();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
// flaky:         org.junit.Assert.assertNotNull(errorManager11);
// flaky:         org.junit.Assert.assertNotNull(jSErrorArray12);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSError jSError3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        boolean boolean7 = compilerOptions0.checkTypes;
        compilerOptions0.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        compilerOptions10.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet18 = compilerOptions17.stripNamePrefixes;
        compilerOptions10.setIdGenerators(strSet18);
        compilerOptions0.setStripNameSuffixes(strSet18);
        java.util.stream.Stream<java.lang.String> strStream21 = strSet18.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strStream21);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager9);
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager9);
        compilerOptions0.ambiguateProperties = true;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = compiler0.acceptEcmaScript5();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("", throwable4);
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.lang.String str7 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        com.google.javascript.jscomp.ErrorManager errorManager18 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState19 = compiler0.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
// flaky:         org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(intermediateState19);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping14 = locationMappingList1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        compiler13.reportCodeChange();
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset17);
        sourceFile18.setOriginalPath("hi!");
        java.lang.String str21 = sourceFile18.getName();
        com.google.javascript.rhino.Node node22 = null; // flaky: compiler13.parse(sourceFile18);
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler13.getErrorManager();
        boolean boolean24 = locationMappingList1.remove((java.lang.Object) compiler13);
        boolean boolean25 = locationMappingList1.isEmpty();
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node22);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        int int26 = locationMappingList9.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        java.lang.String[] strArray36 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        compilerOptions27.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList37);
        boolean boolean40 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList37);
        java.util.Collection<java.lang.String> strCollection41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = locationMappingList9.removeAll(strCollection41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        int int26 = locationMappingList9.size();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping29 = locationMappingList9.set((int) (byte) -1, locationMapping28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        printStream1.println(0);
        printStream1.print((long) (short) -1);
        printStream1.print("Unversioned directory");
        java.io.PrintStream printStream25 = new java.io.PrintStream("Unversioned directory");
        char[] charArray28 = new char[] { '4', '4' };
        printStream25.print(charArray28);
        printStream25.print((int) ' ');
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream25, false);
        printStream25.write((int) '#');
        printStream25.print((float) (short) 0);
        printStream25.println("java.io.IOException");
        java.util.Locale locale40 = null;
        java.io.PrintStream printStream43 = new java.io.PrintStream("Unversioned directory");
        char[] charArray46 = new char[] { '4', '4' };
        printStream43.print(charArray46);
        printStream43.print((int) ' ');
        java.io.PrintStream printStream51 = new java.io.PrintStream((java.io.OutputStream) printStream43, false);
        printStream43.write((int) '#');
        java.util.Locale locale54 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream58 = printStream43.format(locale54, "Unversioned directory", objArray57);
        java.io.PrintStream printStream59 = printStream25.printf(locale40, "Unversioned directory", objArray57);
        printStream59.flush();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions61.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention64 = null;
        compilerOptions61.setCodingConvention(codingConvention64);
        boolean boolean66 = compilerOptions61.generateExports;
        compilerOptions61.printInputDelimiter = false;
        compilerOptions61.setCheckSymbols(true);
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        compilerOptions61.setInputVariableMapSerialized(byteArray75);
        printStream59.write(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            printStream1.write(byteArray75, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream58);
        org.junit.Assert.assertNotNull(printStream59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, 100, 10, 10]");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setLabelRenaming(true);
        compilerOptions12.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions12.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap19 = compilerOptions12.cssRenamingMap;
// flaky:         compiler0.initOptions(compilerOptions12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = compiler0.getSourceLine("java.io.IOException: Unversioned directory", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNull(cssRenamingMap19);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager22 = null; // flaky: compiler20.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler20.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray24 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        boolean boolean29 = compilerOptions26.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions26.setInlineVariables(reach30);
        compilerOptions26.setPrintInputDelimiter(true);
        boolean boolean34 = compilerOptions26.closurePass;
        compilerOptions26.setOutputCharset("java.io.IOException");
// flaky:         compiler20.init(jSSourceFileArray24, jSSourceFileArray25, compilerOptions26);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray38 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setRewriteNewDateGoogNow(true);
        compilerOptions39.optimizeParameters = true;
        com.google.javascript.jscomp.Result result44 = null; // flaky: compiler18.compile(jSSourceFileArray24, jSSourceFileArray38, compilerOptions39);
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler46.getState();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        double double49 = compiler48.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager50 = null; // flaky: compiler48.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler48.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray52 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach58 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions54.setInlineVariables(reach58);
        compilerOptions54.setPrintInputDelimiter(true);
        boolean boolean62 = compilerOptions54.closurePass;
        compilerOptions54.setOutputCharset("java.io.IOException");
// flaky:         compiler48.init(jSSourceFileArray52, jSSourceFileArray53, compilerOptions54);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        double double67 = compiler66.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager68 = null; // flaky: compiler66.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager69 = null; // flaky: compiler66.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray70 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray71 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions72.setRewriteNewDateGoogNow(true);
        boolean boolean75 = compilerOptions72.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach76 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions72.setInlineVariables(reach76);
        compilerOptions72.setPrintInputDelimiter(true);
        boolean boolean80 = compilerOptions72.closurePass;
        compilerOptions72.setOutputCharset("java.io.IOException");
// flaky:         compiler66.init(jSSourceFileArray70, jSSourceFileArray71, compilerOptions72);
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions84.setInlineConstantVars(true);
// flaky:         compiler46.init(jSSourceFileArray52, jSSourceFileArray70, compilerOptions84);
        com.google.javascript.jscomp.CompilerOptions compilerOptions88 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions88.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention91 = null;
        compilerOptions88.setCodingConvention(codingConvention91);
        compilerOptions88.setPropertyAffinity(true);
// flaky:         compiler0.init(jSSourceFileArray24, jSSourceFileArray52, compilerOptions88);
        compilerOptions88.setDefineToDoubleLiteral("java.io.IOException", 10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager22);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(jSSourceFileArray24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray38);
// flaky:         org.junit.Assert.assertNotNull(result44);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager50);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(jSSourceFileArray52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + reach58 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach58.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager68);
// flaky:         org.junit.Assert.assertNotNull(errorManager69);
        org.junit.Assert.assertNotNull(jSSourceFileArray70);
        org.junit.Assert.assertNotNull(jSSourceFileArray71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + reach76 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach76.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.optimizeCalls = true;
        compilerOptions0.setGenerateExports(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        sourceFile1.clearCachedSource();
        java.lang.String str6 = sourceFile1.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet11 = compilerOptions0.aliasableStrings;
        compilerOptions0.generateExports = false;
        boolean boolean14 = compilerOptions0.assumeStrictThis();
        boolean boolean15 = compilerOptions0.markNoSideEffectCalls;
        boolean boolean16 = compilerOptions0.collapseProperties;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        compiler0.disableThreads();
        com.google.javascript.jscomp.JsAst jsAst11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result9 = compiler0.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        com.google.javascript.jscomp.Region region6 = null; // flaky: sourceFile2.getRegion((int) (short) -1);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder10 = builder5.withCharset(charset9);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = builder10.buildFromReader("// Input %num%", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention11 = null;
        compilerOptions8.setCodingConvention(codingConvention11);
        compilerOptions8.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions8.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        compilerOptions8.sourceMapLocationMappings = locationMappingList17;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        compiler20.reportCodeChange();
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset24);
        sourceFile25.setOriginalPath("hi!");
        java.lang.String str28 = sourceFile25.getName();
        com.google.javascript.rhino.Node node29 = null; // flaky: compiler20.parse(sourceFile25);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter30 = null; // flaky: compiler20.getReverseAbstractInterpreter();
        boolean boolean31 = locationMappingList17.remove((java.lang.Object) compiler20);
        int int33 = locationMappingList17.indexOf((java.lang.Object) (-1.0d));
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        boolean boolean37 = compilerOptions34.extractPrototypeMemberDeclarations;
        boolean boolean38 = compilerOptions34.jqueryPass;
        compilerOptions34.setClosurePass(true);
        int int41 = locationMappingList17.lastIndexOf((java.lang.Object) true);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing42 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean43 = tweakProcessing42.shouldStrip();
        java.lang.Class<?> wildcardClass44 = tweakProcessing42.getClass();
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing45 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean46 = tweakProcessing45.shouldStrip();
        java.lang.Class<?> wildcardClass47 = tweakProcessing45.getClass();
        java.lang.reflect.Type[] typeArray48 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass47 };
        java.lang.reflect.Type[] typeArray49 = locationMappingList17.toArray(typeArray48);
        printStream1.println((java.lang.Object) locationMappingList17);
        printStream1.write(1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node29);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + tweakProcessing42 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing42.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + tweakProcessing45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing45.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager9);
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager9);
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.aggressiveVarCheck;
        boolean boolean13 = compilerOptions0.collapseVariableDeclarations;
        boolean boolean14 = compilerOptions0.generatePseudoNames;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        com.google.javascript.rhino.Node node6 = null; // flaky: compiler2.parse(sourceFile4);
        double double7 = compiler2.getProgress();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler2.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str19 = sourceFile18.getOriginalPath();
        com.google.javascript.rhino.Node node20 = null; // flaky: compiler16.parse(sourceFile18);
        double double21 = compiler16.getProgress();
// flaky:         compiler16.check();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = null; // flaky: compiler16.getCodingConvention();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler16.getSourceMap();
        java.io.PrintStream printStream26 = new java.io.PrintStream("Unversioned directory");
        char[] charArray29 = new char[] { '4', '4' };
        printStream26.print(charArray29);
        printStream26.print((int) ' ');
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream26);
        com.google.javascript.jscomp.SourceFile.Builder builder35 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException37 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.lang.Object[] objArray40 = new java.lang.Object[] { builder35, iOException38, (byte) 10 };
        java.io.PrintStream printStream41 = printStream33.printf("", objArray40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler42.getState();
        compiler16.setState(intermediateState43);
        compiler0.setState(intermediateState43);
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(printStream41);
        org.junit.Assert.assertNotNull(intermediateState43);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str7 = sourceFile6.getOriginalPath();
        java.lang.String str9 = sourceFile6.getLine(0);
        java.lang.String str10 = sourceFile6.getName();
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset12);
        sourceFile13.setOriginalPath("hi!");
        sourceFile13.setOriginalPath("");
        boolean boolean18 = sourceFile13.isExtern();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        compilerOptions19.setCodingConvention(codingConvention22);
        boolean boolean24 = compilerOptions19.generateExports;
        compilerOptions19.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy30 = compilerOptions27.variableRenaming;
        compilerOptions19.setVariableRenaming(variableRenamingPolicy30);
        com.google.javascript.jscomp.Result result32 = null; // flaky: compiler0.compile(sourceFile6, sourceFile13, compilerOptions19);
        sourceFile6.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy30 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy30.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
// flaky:         org.junit.Assert.assertNotNull(result32);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.resetWarningsGuard();
        compilerOptions0.convertToDottedProperties = true;
        compilerOptions0.closurePass = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.rhino.Node node6 = compiler0.getRoot();
        com.google.javascript.jscomp.ErrorManager errorManager7 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.JSModule jSModule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = compiler0.toSourceArray(jSModule8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNull(node6);
// flaky:         org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        compilerOptions13.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions13.checkGlobalThisLevel;
        compilerOptions0.checkMissingReturn = checkLevel19;
        compilerOptions0.setMarkAsCompiled(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        boolean boolean27 = compilerOptions23.jqueryPass;
        boolean boolean28 = compilerOptions23.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions29.setLabelRenaming(true);
        compilerOptions29.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean34 = compilerOptions29.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format35 = compilerOptions29.sourceMapFormat;
        compilerOptions23.setSourceMapFormat(format35);
        compilerOptions0.sourceMapFormat = format35;
        compilerOptions0.setCoalesceVariableNames(true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(format35);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.setClosurePass(true);
        compilerOptions0.setLabelRenaming(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler0.getSourceMap();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Result result9 = null; // flaky: compiler0.getResult();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(sourceMap5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(sourceMap7);
// flaky:         org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention11 = null;
        compilerOptions8.setCodingConvention(codingConvention11);
        compilerOptions8.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel15 = compilerOptions8.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray16 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList17, locationMappingArray16);
        compilerOptions8.sourceMapLocationMappings = locationMappingList17;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        compiler20.reportCodeChange();
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.SourceFile sourceFile25 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset24);
        sourceFile25.setOriginalPath("hi!");
        java.lang.String str28 = sourceFile25.getName();
        com.google.javascript.rhino.Node node29 = null; // flaky: compiler20.parse(sourceFile25);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter30 = null; // flaky: compiler20.getReverseAbstractInterpreter();
        boolean boolean31 = locationMappingList17.remove((java.lang.Object) compiler20);
        int int33 = locationMappingList17.indexOf((java.lang.Object) (-1.0d));
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions34.setRewriteNewDateGoogNow(true);
        boolean boolean37 = compilerOptions34.extractPrototypeMemberDeclarations;
        boolean boolean38 = compilerOptions34.jqueryPass;
        compilerOptions34.setClosurePass(true);
        int int41 = locationMappingList17.lastIndexOf((java.lang.Object) true);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing42 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean43 = tweakProcessing42.shouldStrip();
        java.lang.Class<?> wildcardClass44 = tweakProcessing42.getClass();
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing45 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK;
        boolean boolean46 = tweakProcessing45.shouldStrip();
        java.lang.Class<?> wildcardClass47 = tweakProcessing45.getClass();
        java.lang.reflect.Type[] typeArray48 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass47 };
        java.lang.reflect.Type[] typeArray49 = locationMappingList17.toArray(typeArray48);
        printStream1.println((java.lang.Object) locationMappingList17);
        printStream1.print((double) 100L);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertTrue("'" + checkLevel15 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel15.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node29);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + tweakProcessing42 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing42.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + tweakProcessing45 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK + "'", tweakProcessing45.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.CHECK));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet9 = compilerOptions8.stripNamePrefixes;
        byte[] byteArray10 = compilerOptions8.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup11;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        compilerOptions8.setWarningLevel(diagnosticGroup11, checkLevel20);
        compilerOptions0.checkUnreachableCode = checkLevel20;
        compilerOptions0.prettyPrint = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        compilerOptions25.setCodingConvention(codingConvention28);
        compilerOptions25.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions25.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray33 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList34 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34, locationMappingArray33);
        compilerOptions25.sourceMapLocationMappings = locationMappingList34;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        double double38 = compiler37.getProgress();
        compiler37.reportCodeChange();
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.SourceFile sourceFile42 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset41);
        sourceFile42.setOriginalPath("hi!");
        java.lang.String str45 = sourceFile42.getName();
        com.google.javascript.rhino.Node node46 = null; // flaky: compiler37.parse(sourceFile42);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter47 = null; // flaky: compiler37.getReverseAbstractInterpreter();
        boolean boolean48 = locationMappingList34.remove((java.lang.Object) compiler37);
        int int50 = locationMappingList34.indexOf((java.lang.Object) (-1.0d));
        java.lang.String[] strArray53 = new java.lang.String[] { "2019/07/12 07:12", "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = locationMappingList34.containsAll((java.util.Collection<java.lang.String>) strList54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions57.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention60 = null;
        compilerOptions57.setCodingConvention(codingConvention60);
        boolean boolean62 = compilerOptions57.generateExports;
        compilerOptions57.gatherCssNames = false;
        boolean boolean65 = compilerOptions57.optimizeReturns;
        compilerOptions57.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions69 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions69.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention72 = null;
        compilerOptions69.setCodingConvention(codingConvention72);
        compilerOptions69.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel76 = compilerOptions69.checkProvides;
        java.lang.String[] strArray78 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        compilerOptions69.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList79);
        java.util.stream.Stream<java.lang.String> strStream82 = strList79.stream();
        compilerOptions57.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList79);
        boolean boolean84 = locationMappingList34.removeAll((java.util.Collection<java.lang.String>) strList79);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList79);
        compilerOptions0.printInputDelimiter = false;
        boolean boolean88 = compilerOptions0.optimizeCalls;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node46);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + checkLevel76 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel76.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strStream82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.setMarkNoSideEffectCalls(false);
        org.junit.Assert.assertNull(cssRenamingMap7);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        double double19 = compiler18.getProgress();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        double double21 = compiler20.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager22 = null; // flaky: compiler20.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler20.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray24 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        boolean boolean29 = compilerOptions26.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions26.setInlineVariables(reach30);
        compilerOptions26.setPrintInputDelimiter(true);
        boolean boolean34 = compilerOptions26.closurePass;
        compilerOptions26.setOutputCharset("java.io.IOException");
// flaky:         compiler20.init(jSSourceFileArray24, jSSourceFileArray25, compilerOptions26);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray38 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setRewriteNewDateGoogNow(true);
        compilerOptions39.optimizeParameters = true;
        com.google.javascript.jscomp.Result result44 = null; // flaky: compiler18.compile(jSSourceFileArray24, jSSourceFileArray38, compilerOptions39);
        java.io.PrintStream printStream45 = null;
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler(printStream45);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState47 = compiler46.getState();
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        double double49 = compiler48.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager50 = null; // flaky: compiler48.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler48.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray52 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        boolean boolean57 = compilerOptions54.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach58 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions54.setInlineVariables(reach58);
        compilerOptions54.setPrintInputDelimiter(true);
        boolean boolean62 = compilerOptions54.closurePass;
        compilerOptions54.setOutputCharset("java.io.IOException");
// flaky:         compiler48.init(jSSourceFileArray52, jSSourceFileArray53, compilerOptions54);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        double double67 = compiler66.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager68 = null; // flaky: compiler66.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager69 = null; // flaky: compiler66.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray70 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray71 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions72.setRewriteNewDateGoogNow(true);
        boolean boolean75 = compilerOptions72.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach76 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions72.setInlineVariables(reach76);
        compilerOptions72.setPrintInputDelimiter(true);
        boolean boolean80 = compilerOptions72.closurePass;
        compilerOptions72.setOutputCharset("java.io.IOException");
// flaky:         compiler66.init(jSSourceFileArray70, jSSourceFileArray71, compilerOptions72);
        com.google.javascript.jscomp.CompilerOptions compilerOptions84 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions84.setInlineConstantVars(true);
// flaky:         compiler46.init(jSSourceFileArray52, jSSourceFileArray70, compilerOptions84);
        com.google.javascript.jscomp.CompilerOptions compilerOptions88 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions88.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention91 = null;
        compilerOptions88.setCodingConvention(codingConvention91);
        compilerOptions88.setPropertyAffinity(true);
// flaky:         compiler0.init(jSSourceFileArray24, jSSourceFileArray52, compilerOptions88);
        boolean boolean96 = compilerOptions88.inlineFunctions;
        compilerOptions88.setCheckMissingGetCssNameBlacklist("// Input %num%");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager22);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(jSSourceFileArray24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray38);
// flaky:         org.junit.Assert.assertNotNull(result44);
        org.junit.Assert.assertNotNull(intermediateState47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager50);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(jSSourceFileArray52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + reach58 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach58.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager68);
// flaky:         org.junit.Assert.assertNotNull(errorManager69);
        org.junit.Assert.assertNotNull(jSSourceFileArray70);
        org.junit.Assert.assertNotNull(jSSourceFileArray71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + reach76 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach76.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = builder0.buildFromInputStream("java.io.IOException: ", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        compiler7.reportCodeChange();
        java.lang.String str10 = compiler7.getAstDotGraph();
        com.google.javascript.rhino.Node node11 = compiler7.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler7.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager13 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler7.getState();
        compiler0.setState(intermediateState14);
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = null; // flaky: compiler0.getWarnings();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(sourceMap5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(sourceMap12);
// flaky:         org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(intermediateState14);
// flaky:         org.junit.Assert.assertNotNull(jSErrorArray16);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        boolean boolean29 = compilerOptions26.extractPrototypeMemberDeclarations;
        compilerOptions26.convertToDottedProperties = true;
        boolean boolean32 = compilerOptions26.inlineConstantVars;
        boolean boolean33 = compilerOptions26.extractPrototypeMemberDeclarations;
        boolean boolean34 = compilerOptions26.gatherCssNames;
        compilerOptions26.setTweakToStringLiteral("2019/07/12 07:12", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        compilerOptions26.setRemoveDeadCode(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        boolean boolean43 = compilerOptions40.extractPrototypeMemberDeclarations;
        boolean boolean44 = compilerOptions40.jqueryPass;
        boolean boolean45 = compilerOptions40.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setLabelRenaming(true);
        compilerOptions46.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean51 = compilerOptions46.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format52 = compilerOptions46.sourceMapFormat;
        compilerOptions40.setSourceMapFormat(format52);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing54 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions40.setTweakProcessing(tweakProcessing54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention59 = null;
        compilerOptions56.setCodingConvention(codingConvention59);
        compilerOptions56.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel63 = compilerOptions56.checkProvides;
        java.util.Set<java.lang.String> strSet64 = compilerOptions56.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream65 = strSet64.stream();
        compilerOptions40.stripTypes = strSet64;
        compilerOptions26.setStripNameSuffixes(strSet64);
        boolean boolean68 = locationMappingList9.retainAll((java.util.Collection<java.lang.String>) strSet64);
        java.util.Iterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor69 = locationMappingList9.iterator();
        locationMappingList9.clear();
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(format52);
        org.junit.Assert.assertTrue("'" + tweakProcessing54 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing54.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel63 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel63.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strStream65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(locationMappingItor69);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        compiler13.reportCodeChange();
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset17);
        sourceFile18.setOriginalPath("hi!");
        java.lang.String str21 = sourceFile18.getName();
        com.google.javascript.rhino.Node node22 = null; // flaky: compiler13.parse(sourceFile18);
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler13.getErrorManager();
        boolean boolean24 = locationMappingList1.remove((java.lang.Object) compiler13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor26 = locationMappingList1.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node22);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setExtractPrototypeMemberDeclarations(true);
        compilerOptions0.reserveRawExports = false;
        compilerOptions0.crossModuleCodeMotion = false;
        com.google.javascript.jscomp.CheckLevel checkLevel10 = compilerOptions0.aggressiveVarCheck;
        com.google.javascript.jscomp.WarningsGuard warningsGuard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel10 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel10.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        boolean boolean3 = compilerOptions0.exportTestFunctions;
        compilerOptions0.lineBreak = false;
        compilerOptions0.setCrossModuleMethodMotion(true);
        compilerOptions0.setDefineToNumberLiteral("", (int) (short) 1);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager13 = null; // flaky: compiler11.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager14 = null; // flaky: compiler11.getErrorManager();
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager14);
        compilerOptions0.inputDelimiter = "java.io.IOException: Unversioned directory";
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager13);
// flaky:         org.junit.Assert.assertNotNull(errorManager14);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("Unversioned directory", "java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.setCheckSuspiciousCode(true);
        compilerOptions0.setReserveRawExports(false);
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        java.lang.String str12 = compiler0.getAstDotGraph();
        java.lang.String str13 = null; // flaky: compiler0.toSource();
        double double14 = compiler0.getProgress();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "// Input %num%");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: // Input %num%");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("// Input %num%", "hi!", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        com.google.javascript.jscomp.ErrorManager errorManager18 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter19 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
// flaky:         org.junit.Assert.assertNotNull(errorManager18);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter19);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result11 = null; // flaky: compiler0.getResult();
        com.google.javascript.jscomp.JSError jSError12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(result11);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException", "java.io.IOException", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        int int11 = 0; // flaky: compiler0.getWarningCount();
        java.lang.String str12 = compiler0.getAstDotGraph();
        java.io.PrintStream printStream14 = new java.io.PrintStream("Unversioned directory");
        char[] charArray17 = new char[] { '4', '4' };
        printStream14.print(charArray17);
        printStream14.print((int) ' ');
        java.io.PrintStream printStream21 = new java.io.PrintStream((java.io.OutputStream) printStream14);
        com.google.javascript.jscomp.SourceFile.Builder builder23 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException25 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.lang.Object[] objArray28 = new java.lang.Object[] { builder23, iOException26, (byte) 10 };
        java.io.PrintStream printStream29 = printStream21.printf("", objArray28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler(printStream29);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        double double32 = compiler31.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager33 = null; // flaky: compiler31.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager34 = null; // flaky: compiler31.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        boolean boolean40 = compilerOptions37.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach41 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions37.setInlineVariables(reach41);
        compilerOptions37.setPrintInputDelimiter(true);
        boolean boolean45 = compilerOptions37.closurePass;
        compilerOptions37.setOutputCharset("java.io.IOException");
// flaky:         compiler31.init(jSSourceFileArray35, jSSourceFileArray36, compilerOptions37);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        compiler49.reportCodeChange();
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.SourceFile sourceFile54 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset53);
        sourceFile54.setOriginalPath("hi!");
        java.lang.String str57 = sourceFile54.getName();
        com.google.javascript.rhino.Node node58 = null; // flaky: compiler49.parse(sourceFile54);
        boolean boolean59 = false; // flaky: compiler49.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray60 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray61 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        double double63 = compiler62.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager64 = null; // flaky: compiler62.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager65 = null; // flaky: compiler62.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray66 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray67 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions68.setRewriteNewDateGoogNow(true);
        boolean boolean71 = compilerOptions68.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach72 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions68.setInlineVariables(reach72);
        compilerOptions68.setPrintInputDelimiter(true);
        boolean boolean76 = compilerOptions68.closurePass;
        compilerOptions68.setOutputCharset("java.io.IOException");
// flaky:         compiler62.init(jSSourceFileArray66, jSSourceFileArray67, compilerOptions68);
// flaky:         compiler49.init(jSSourceFileArray60, jSModuleArray61, compilerOptions68);
        com.google.javascript.jscomp.CompilerOptions compilerOptions81 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions81.setRewriteNewDateGoogNow(true);
        boolean boolean84 = compilerOptions81.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach85 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions81.setInlineVariables(reach85);
        boolean boolean87 = compilerOptions81.removeUnusedVars;
        com.google.javascript.jscomp.Result result88 = null; // flaky: compiler30.compile(jSSourceFileArray36, jSModuleArray61, compilerOptions81);
        com.google.javascript.jscomp.JSModule[] jSModuleArray89 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions90 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions90.setRewriteNewDateGoogNow(true);
        boolean boolean93 = compilerOptions90.extractPrototypeMemberDeclarations;
        boolean boolean94 = compilerOptions90.jqueryPass;
        compilerOptions90.collapseAnonymousFunctions = false;
        compilerOptions90.markNoSideEffectCalls = true;
// flaky:         compiler0.init(jSSourceFileArray36, jSModuleArray89, compilerOptions90);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(printStream29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager33);
// flaky:         org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(jSSourceFileArray35);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + reach41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach41.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray60);
        org.junit.Assert.assertNotNull(jSModuleArray61);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager64);
// flaky:         org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(jSSourceFileArray66);
        org.junit.Assert.assertNotNull(jSSourceFileArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + reach72 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach72.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + reach85 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach85.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
// flaky:         org.junit.Assert.assertNotNull(result88);
        org.junit.Assert.assertNotNull(jSModuleArray89);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        java.util.Locale locale12 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream16 = printStream1.format(locale12, "Unversioned directory", objArray15);
        printStream16.println(10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream21 = new java.io.PrintStream((java.io.OutputStream) printStream16, true, "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream16);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        int int26 = locationMappingList9.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        java.lang.String[] strArray36 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        compilerOptions27.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList37);
        boolean boolean40 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList37);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping42 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList9.add((int) '4', locationMapping42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        compilerOptions39.setInlineGetters(false);
        java.lang.String str46 = compilerOptions39.syntheticBlockStartMarker;
        compilerOptions39.setTweakToDoubleLiteral("java.io.IOException: ", (double) '#');
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream1 = new java.io.PrintStream("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: java.io.IOException: java.io.IOException: 2019/07/12 07:12 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.io.IOException iOException36 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException37 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException36);
        int int40 = locationMappingList1.indexOf((java.lang.Object) iOException36);
        int int41 = locationMappingList1.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention45 = null;
        compilerOptions42.setCodingConvention(codingConvention45);
        boolean boolean47 = compilerOptions42.generateExports;
        compilerOptions42.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy53 = compilerOptions50.variableRenaming;
        compilerOptions42.setVariableRenaming(variableRenamingPolicy53);
        compilerOptions42.printInputDelimiter = false;
        int int57 = locationMappingList1.lastIndexOf((java.lang.Object) compilerOptions42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList60 = locationMappingList1.subList((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy53 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy53.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        sourceFile1.setOriginalPath("");
        boolean boolean7 = sourceFile1.isExtern();
        sourceFile1.clearCachedSource();
        boolean boolean9 = sourceFile1.isExtern();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.isIdeMode();
        com.google.javascript.jscomp.Result result11 = null; // flaky: compiler0.getResult();
        com.google.javascript.jscomp.PassConfig passConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(result11);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        char[] charArray22 = new char[] { '4', '4' };
        printStream19.print(charArray22);
        printStream19.print((int) ' ');
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream19.write(byteArray32, (int) (byte) 0, (int) (byte) 1);
        char[] charArray42 = new char[] { ' ', '#', '4', 'a', '#', 'a' };
        printStream19.print(charArray42);
        printStream1.println(charArray42);
        java.io.PrintStream printStream46 = null;
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler(printStream46);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState48 = compiler47.getState();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager52 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach59 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions55.setInlineVariables(reach59);
        compilerOptions55.setPrintInputDelimiter(true);
        boolean boolean63 = compilerOptions55.closurePass;
        compilerOptions55.setOutputCharset("java.io.IOException");
// flaky:         compiler49.init(jSSourceFileArray53, jSSourceFileArray54, compilerOptions55);
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        double double68 = compiler67.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager69 = null; // flaky: compiler67.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager70 = null; // flaky: compiler67.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray71 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray72 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions73.setRewriteNewDateGoogNow(true);
        boolean boolean76 = compilerOptions73.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach77 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions73.setInlineVariables(reach77);
        compilerOptions73.setPrintInputDelimiter(true);
        boolean boolean81 = compilerOptions73.closurePass;
        compilerOptions73.setOutputCharset("java.io.IOException");
// flaky:         compiler67.init(jSSourceFileArray71, jSSourceFileArray72, compilerOptions73);
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions85.setInlineConstantVars(true);
// flaky:         compiler47.init(jSSourceFileArray53, jSSourceFileArray71, compilerOptions85);
        java.io.PrintStream printStream89 = printStream1.format("java.io.IOException: java.io.IOException: 2019/07/12 07:12", (java.lang.Object[]) jSSourceFileArray53);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , #, 4, a, #, a]");
        org.junit.Assert.assertNotNull(intermediateState48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
// flaky:         org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + reach59 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach59.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager69);
// flaky:         org.junit.Assert.assertNotNull(errorManager70);
        org.junit.Assert.assertNotNull(jSSourceFileArray71);
        org.junit.Assert.assertNotNull(jSSourceFileArray72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + reach77 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach77.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(printStream89);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        compilerOptions0.disableRuntimeTypeCheck();
        com.google.javascript.jscomp.WarningsGuard warningsGuard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromReader("// Input %num%", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup0;
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        double double3 = compiler2.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager4 = null; // flaky: compiler2.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler2.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setRewriteNewDateGoogNow(true);
        boolean boolean11 = compilerOptions8.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach12 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions8.setInlineVariables(reach12);
        compilerOptions8.setPrintInputDelimiter(true);
        boolean boolean16 = compilerOptions8.closurePass;
        compilerOptions8.setOutputCharset("java.io.IOException");
// flaky:         compiler2.init(jSSourceFileArray6, jSSourceFileArray7, compilerOptions8);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        compilerOptions21.optimizeParameters = true;
        com.google.javascript.jscomp.Result result26 = null; // flaky: compiler0.compile(jSSourceFileArray6, jSSourceFileArray20, compilerOptions21);
        boolean boolean27 = false; // flaky: compiler0.acceptEcmaScript5();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager4);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + reach12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach12.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
// flaky:         org.junit.Assert.assertNotNull(result26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream11.println();
        printStream11.write((int) (byte) 100);
        byte[] byteArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            printStream11.write(byteArray15, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup3);
        org.junit.Assert.assertNotNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        java.lang.String[] strArray28 = new java.lang.String[] { "2019/07/12 07:12", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList29);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping34 = locationMappingList9.set((int) (short) 1, locationMapping33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("java.io.IOException: java.io.IOException: 2019/07/12 07:12", "2019/07/12 07:12");
        java.lang.Class<?> wildcardClass3 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
// flaky:         compiler0.check();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = null; // flaky: compiler0.getCodingConvention();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        java.io.PrintStream printStream10 = new java.io.PrintStream("Unversioned directory");
        char[] charArray13 = new char[] { '4', '4' };
        printStream10.print(charArray13);
        printStream10.print((int) ' ');
        java.io.PrintStream printStream17 = new java.io.PrintStream((java.io.OutputStream) printStream10);
        com.google.javascript.jscomp.SourceFile.Builder builder19 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException21 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.lang.Object[] objArray24 = new java.lang.Object[] { builder19, iOException22, (byte) 10 };
        java.io.PrintStream printStream25 = printStream17.printf("", objArray24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(printStream25);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler26.getState();
        compiler0.setState(intermediateState27);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null; // flaky: compiler0.getTypeRegistry();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(printStream25);
        org.junit.Assert.assertNotNull(intermediateState27);
// flaky:         org.junit.Assert.assertNotNull(jSTypeRegistry29);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet4 = compilerOptions3.stripNamePrefixes;
        byte[] byteArray5 = compilerOptions3.inputVariableMapSerialized;
        compilerOptions3.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler8 = compilerOptions3.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy9 = compilerOptions3.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        double double11 = compiler10.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager12 = null; // flaky: compiler10.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler13 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager12);
        compilerOptions3.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager12);
// flaky:         compiler1.setErrorManager(errorManager12);
        com.google.javascript.jscomp.JSModule jSModule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = compiler1.toSourceArray(jSModule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(aliasTransformationHandler8);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy9 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy9.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager12);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder9.withCharset(charset10);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = builder9.buildFromFile(file12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        java.lang.Object[] objArray12 = locationMappingList9.toArray();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor14 = locationMappingList9.listIterator(0);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        compiler15.reportCodeChange();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset19);
        sourceFile20.setOriginalPath("hi!");
        java.lang.String str23 = sourceFile20.getName();
        com.google.javascript.rhino.Node node24 = null; // flaky: compiler15.parse(sourceFile20);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter25 = null; // flaky: compiler15.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = compiler15.tracker;
        boolean boolean27 = locationMappingList9.equals((java.lang.Object) compiler15);
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.SourceFile sourceFile30 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset29);
        sourceFile30.setOriginalPath("hi!");
        sourceFile30.setOriginalPath("");
        sourceFile30.setOriginalPath("");
        int int37 = locationMappingList9.indexOf((java.lang.Object) sourceFile30);
        com.google.javascript.jscomp.SourceFile.Builder builder38 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator40 = null;
        com.google.javascript.jscomp.SourceFile sourceFile41 = builder38.buildFromGenerator("hi!", generator40);
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder43 = builder38.withCharset(charset42);
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder45 = builder38.withCharset(charset44);
        com.google.javascript.jscomp.SourceFile.Builder builder47 = builder38.withOriginalPath("Unversioned directory");
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder49 = builder47.withCharset(charset48);
        com.google.javascript.jscomp.SourceFile.Builder builder51 = builder49.withOriginalPath("java.io.IOException");
        boolean boolean52 = locationMappingList9.contains((java.lang.Object) builder49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping54 = locationMappingList9.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(locationMappingItor14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node24);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter25);
        org.junit.Assert.assertNull(performanceTracker26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sourceFile30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(sourceFile41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.MessageBundle messageBundle17 = null;
        compilerOptions0.messageBundle = messageBundle17;
        compilerOptions0.setInlineGetters(true);
        compilerOptions0.removeUnusedPrototypeProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention26 = null;
        compilerOptions23.setCodingConvention(codingConvention26);
        boolean boolean28 = compilerOptions23.computeFunctionSideEffects;
        boolean boolean29 = compilerOptions23.printInputDelimiter;
        compilerOptions23.setGeneratePseudoNames(true);
        boolean boolean32 = compilerOptions23.disambiguateProperties;
        java.util.Set<java.lang.String> strSet33 = compilerOptions23.aliasableStrings;
        compilerOptions0.stripNameSuffixes = strSet33;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        boolean boolean38 = compilerOptions35.extractPrototypeMemberDeclarations;
        compilerOptions35.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet41 = compilerOptions35.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = compilerOptions35.cssRenamingMap;
        boolean boolean43 = compilerOptions35.preferLineBreakAtEndOfFile;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        boolean boolean49 = compilerOptions44.computeFunctionSideEffects;
        boolean boolean50 = compilerOptions44.printInputDelimiter;
        compilerOptions44.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions44.enableRuntimeTypeCheck("java.io.IOException: ");
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet56 = compilerOptions55.stripNamePrefixes;
        byte[] byteArray57 = compilerOptions55.inputVariableMapSerialized;
        compilerOptions55.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler60 = compilerOptions55.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy61 = compilerOptions55.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        double double63 = compiler62.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager64 = null; // flaky: compiler62.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler65 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager64);
        compilerOptions55.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager64);
        com.google.javascript.jscomp.CheckLevel checkLevel67 = compilerOptions55.aggressiveVarCheck;
        compilerOptions44.setCheckUnreachableCode(checkLevel67);
        compilerOptions35.setCheckMissingReturn(checkLevel67);
        compilerOptions0.checkProvides = checkLevel67;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(cssRenamingMap42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNull(byteArray57);
        org.junit.Assert.assertNotNull(aliasTransformationHandler60);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy61 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy61.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager64);
        org.junit.Assert.assertTrue("'" + checkLevel67 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel67.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        boolean boolean6 = compilerOptions0.inlineLocalFunctions;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.flowSensitiveInlineVariables = false;
        compilerOptions0.checkMissingGetCssNameBlacklist = "java.io.IOException: ";
        compilerOptions0.removeUnusedVars = true;
        compilerOptions0.setCrossModuleCodeMotion(false);
        boolean boolean12 = compilerOptions0.markNoSideEffectCalls;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str12 = sourceFile11.getOriginalPath();
        com.google.javascript.rhino.Node node13 = null; // flaky: compiler9.parse(sourceFile11);
        double double14 = compiler9.getProgress();
// flaky:         compiler9.check();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null; // flaky: compiler9.getCodingConvention();
        compilerOptions0.setCodingConvention(codingConvention16);
        boolean boolean18 = compilerOptions0.removeDeadCode;
        java.io.PrintStream printStream20 = new java.io.PrintStream("Unversioned directory");
        char[] charArray23 = new char[] { '4', '4' };
        printStream20.print(charArray23);
        printStream20.print((int) ' ');
        java.io.PrintStream printStream27 = new java.io.PrintStream((java.io.OutputStream) printStream20);
        com.google.javascript.jscomp.SourceFile.Builder builder29 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException31 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.lang.Object[] objArray34 = new java.lang.Object[] { builder29, iOException32, (byte) 10 };
        java.io.PrintStream printStream35 = printStream27.printf("", objArray34);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler(printStream35);
        com.google.javascript.jscomp.ErrorManager errorManager37 = null; // flaky: compiler36.getErrorManager();
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(printStream35);
// flaky:         org.junit.Assert.assertNotNull(errorManager37);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.hasErrors();
        java.lang.String str11 = null; // flaky: compiler0.toSource();
        com.google.javascript.jscomp.JsAst jsAst12 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.replaceScript(jsAst12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("hi!");
        com.google.javascript.jscomp.SourceFile sourceFile11 = builder0.buildFromFile("Unversioned directory");
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = builder0.buildFromReader("java.io.IOException", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sourceFile11);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        compilerOptions39.setInlineGetters(false);
        java.lang.String str46 = compilerOptions39.syntheticBlockStartMarker;
        boolean boolean47 = compilerOptions39.exportTestFunctions;
        com.google.javascript.jscomp.MessageBundle messageBundle48 = null;
        compilerOptions39.messageBundle = messageBundle48;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        printStream8.println((float) (byte) -1);
        java.io.PrintStream printStream13 = new java.io.PrintStream("Unversioned directory");
        char[] charArray16 = new char[] { '4', '4' };
        printStream13.print(charArray16);
        printStream13.print((int) ' ');
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream13.write(byteArray26, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream13.println((java.lang.Object) diagnosticGroup30);
        java.io.PrintStream printStream32 = new java.io.PrintStream((java.io.OutputStream) printStream13);
        java.io.PrintStream printStream34 = printStream13.append((java.lang.CharSequence) "");
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        double double37 = compiler36.getProgress();
        compiler36.reportCodeChange();
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.SourceFile sourceFile41 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset40);
        sourceFile41.setOriginalPath("hi!");
        java.lang.String str44 = sourceFile41.getName();
        com.google.javascript.rhino.Node node45 = null; // flaky: compiler36.parse(sourceFile41);
        boolean boolean46 = false; // flaky: compiler36.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray47 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray48 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        double double50 = compiler49.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager51 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager52 = null; // flaky: compiler49.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        boolean boolean58 = compilerOptions55.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach59 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions55.setInlineVariables(reach59);
        compilerOptions55.setPrintInputDelimiter(true);
        boolean boolean63 = compilerOptions55.closurePass;
        compilerOptions55.setOutputCharset("java.io.IOException");
// flaky:         compiler49.init(jSSourceFileArray53, jSSourceFileArray54, compilerOptions55);
// flaky:         compiler36.init(jSSourceFileArray47, jSModuleArray48, compilerOptions55);
        java.io.PrintStream printStream68 = printStream34.printf("", (java.lang.Object[]) jSSourceFileArray47);
        java.io.PrintStream printStream69 = printStream8.printf("java.io.IOException: ", (java.lang.Object[]) jSSourceFileArray47);
        java.io.PrintStream printStream71 = printStream69.append('4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup30);
        org.junit.Assert.assertNotNull(printStream34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node45);
// flaky:         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray47);
        org.junit.Assert.assertNotNull(jSModuleArray48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager51);
// flaky:         org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + reach59 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach59.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(printStream68);
        org.junit.Assert.assertNotNull(printStream69);
        org.junit.Assert.assertNotNull(printStream71);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.labelRenaming = true;
        compilerOptions0.setMarkNoSideEffectCalls(false);
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = false;
        compilerOptions0.prettyPrint = false;
        boolean boolean14 = compilerOptions0.checkSuspiciousCode;
        compilerOptions0.setCollapseAnonymousFunctions(false);
        compilerOptions0.optimizeArgumentsArray = false;
        compilerOptions0.setAliasKeywords(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup3;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions5.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention8 = null;
        compilerOptions5.setCodingConvention(codingConvention8);
        compilerOptions5.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions5.checkProvides;
        compilerOptions0.setWarningLevel(diagnosticGroup3, checkLevel12);
        compilerOptions0.enableRuntimeTypeCheck("2019/07/12 07:12");
        compilerOptions0.setTweakToStringLiteral("// Input %num%", "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(diagnosticGroup3);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream22 = printStream1.append((java.lang.CharSequence) "");
        printStream22.print((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream28 = printStream22.append((java.lang.CharSequence) "java.io.IOException: ", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup18);
        org.junit.Assert.assertNotNull(printStream22);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        double double5 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        double double7 = compiler6.getProgress();
        compiler6.reportCodeChange();
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        compiler6.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState11 = compiler6.getState();
        compiler0.setState(intermediateState11);
        boolean boolean13 = false; // flaky: compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        double double17 = compiler16.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager18 = null; // flaky: compiler16.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager19 = null; // flaky: compiler16.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray21 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions22.setRewriteNewDateGoogNow(true);
        boolean boolean25 = compilerOptions22.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach26 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions22.setInlineVariables(reach26);
        compilerOptions22.setPrintInputDelimiter(true);
        boolean boolean30 = compilerOptions22.closurePass;
        compilerOptions22.setOutputCharset("java.io.IOException");
// flaky:         compiler16.init(jSSourceFileArray20, jSSourceFileArray21, compilerOptions22);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions35.setRewriteNewDateGoogNow(true);
        compilerOptions35.optimizeParameters = true;
        com.google.javascript.jscomp.Result result40 = null; // flaky: compiler14.compile(jSSourceFileArray20, jSSourceFileArray34, compilerOptions35);
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        double double42 = compiler41.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager43 = null; // flaky: compiler41.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager44 = null; // flaky: compiler41.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray45 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray46 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions47.setRewriteNewDateGoogNow(true);
        boolean boolean50 = compilerOptions47.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach51 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions47.setInlineVariables(reach51);
        compilerOptions47.setPrintInputDelimiter(true);
        boolean boolean55 = compilerOptions47.closurePass;
        compilerOptions47.setOutputCharset("java.io.IOException");
// flaky:         compiler41.init(jSSourceFileArray45, jSSourceFileArray46, compilerOptions47);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions59.setRewriteNewDateGoogNow(true);
        boolean boolean62 = compilerOptions59.extractPrototypeMemberDeclarations;
        compilerOptions59.convertToDottedProperties = true;
        boolean boolean65 = compilerOptions59.inlineConstantVars;
        compilerOptions59.aliasAllStrings = false;
        boolean boolean68 = compilerOptions59.smartNameRemoval;
        compilerOptions59.gatherCssNames = true;
        compilerOptions59.aliasExternals = true;
// flaky:         compiler0.init(jSSourceFileArray34, jSSourceFileArray45, compilerOptions59);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(intermediateState11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager18);
// flaky:         org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertNotNull(jSSourceFileArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + reach26 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach26.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
// flaky:         org.junit.Assert.assertNotNull(result40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager43);
// flaky:         org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(jSSourceFileArray45);
        org.junit.Assert.assertNotNull(jSSourceFileArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + reach51 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach51.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        java.util.Locale locale12 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { "Unversioned directory" };
        java.io.PrintStream printStream16 = printStream1.format(locale12, "Unversioned directory", objArray15);
        printStream16.println((double) 1);
        printStream16.print(1L);
        printStream16.flush();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[Unversioned directory]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[Unversioned directory]");
        org.junit.Assert.assertNotNull(printStream16);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.exportTestFunctions;
        boolean boolean7 = compilerOptions0.aliasExternals;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions0.setRewriteFunctionExpressions(false);
        compilerOptions0.setRenamePrefixNamespace("java.io.IOException: ");
        compilerOptions0.setChainCalls(true);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel5 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setOutputJsStringUsage(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions8.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel11 = compilerOptions8.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions8.reportMissingOverride;
        compilerOptions8.checkControlStructures = true;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap15 = null;
        compilerOptions8.cssRenamingMap = cssRenamingMap15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet25 = compilerOptions24.stripNamePrefixes;
        compilerOptions17.setIdGenerators(strSet25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGeneratePseudoNames(true);
        compilerOptions27.inlineLocalFunctions = false;
        compilerOptions27.setIdeMode(true);
        compilerOptions27.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions40.setRewriteNewDateGoogNow(true);
        boolean boolean43 = compilerOptions40.extractPrototypeMemberDeclarations;
        compilerOptions40.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel46 = compilerOptions40.checkGlobalThisLevel;
        compilerOptions27.checkMissingReturn = checkLevel46;
        compilerOptions17.aggressiveVarCheck = checkLevel46;
        compilerOptions8.setCheckMissingGetCssNameLevel(checkLevel46);
        compilerOptions0.aggressiveVarCheck = checkLevel46;
        org.junit.Assert.assertTrue("'" + checkLevel5 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel5.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel11 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel11.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel46 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel46.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        compilerOptions44.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions44.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        compilerOptions44.sourceMapLocationMappings = locationMappingList53;
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions44.aggressiveVarCheck;
        compilerOptions39.checkProvides = checkLevel56;
        compilerOptions39.setCoalesceVariableNames(false);
        compilerOptions39.setInlineProperties(false);
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean6 = locationMappingList1.remove((java.lang.Object) "hi!");
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        byte[] byteArray9 = compilerOptions7.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup10 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup10;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        compilerOptions7.setWarningLevel(diagnosticGroup10, checkLevel19);
        java.util.Set<java.lang.String> strSet21 = compilerOptions7.stripNamePrefixes;
        boolean boolean22 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor23 = locationMappingList1.listIterator();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor24 = locationMappingList1.listIterator();
        java.io.PrintStream printStream26 = new java.io.PrintStream("Unversioned directory");
        char[] charArray29 = new char[] { '4', '4' };
        printStream26.print(charArray29);
        printStream26.print((int) ' ');
        java.io.PrintStream printStream33 = new java.io.PrintStream((java.io.OutputStream) printStream26);
        com.google.javascript.jscomp.SourceFile.Builder builder35 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException37 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException37);
        java.lang.Object[] objArray40 = new java.lang.Object[] { builder35, iOException38, (byte) 10 };
        java.io.PrintStream printStream41 = printStream33.printf("", objArray40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler(printStream41);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState43 = compiler42.getState();
        java.io.PrintStream printStream44 = null;
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler(printStream44);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState46 = compiler45.getState();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        double double48 = compiler47.getProgress();
        compiler47.reportCodeChange();
        com.google.javascript.rhino.Node node50 = compiler47.getRoot();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        double double52 = compiler51.getProgress();
        compiler51.reportCodeChange();
        com.google.javascript.jscomp.Scope scope54 = compiler51.getTopScope();
        compiler51.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState56 = compiler51.getState();
        compiler47.setState(intermediateState56);
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        double double59 = compiler58.getProgress();
        compiler58.reportCodeChange();
        java.lang.String str61 = compiler58.getAstDotGraph();
        com.google.javascript.rhino.Node node62 = compiler58.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap63 = compiler58.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager64 = null; // flaky: compiler58.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        double double66 = compiler65.getProgress();
        compiler65.reportCodeChange();
        java.lang.String str68 = compiler65.getAstDotGraph();
        com.google.javascript.rhino.Node node69 = compiler65.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap70 = compiler65.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager71 = null; // flaky: compiler65.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState72 = compiler65.getState();
        compiler58.setState(intermediateState72);
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler();
        double double75 = compiler74.getProgress();
        compiler74.reportCodeChange();
        java.lang.String str77 = compiler74.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState78 = compiler74.getState();
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler();
        double double80 = compiler79.getProgress();
        compiler79.reportCodeChange();
        java.lang.String str82 = compiler79.getAstDotGraph();
        com.google.javascript.rhino.Node node83 = compiler79.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap84 = compiler79.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager85 = null; // flaky: compiler79.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler86 = new com.google.javascript.jscomp.Compiler();
        double double87 = compiler86.getProgress();
        compiler86.reportCodeChange();
        java.lang.String str89 = compiler86.getAstDotGraph();
        com.google.javascript.rhino.Node node90 = compiler86.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap91 = compiler86.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager92 = null; // flaky: compiler86.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState93 = compiler86.getState();
        compiler79.setState(intermediateState93);
        com.google.javascript.jscomp.Compiler.IntermediateState[] intermediateStateArray95 = new com.google.javascript.jscomp.Compiler.IntermediateState[] { intermediateState43, intermediateState46, intermediateState56, intermediateState72, intermediateState78, intermediateState93 };
        com.google.javascript.jscomp.Compiler.IntermediateState[] intermediateStateArray96 = locationMappingList1.toArray(intermediateStateArray95);
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping98 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping99 = locationMappingList1.set(0, locationMapping98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(diagnosticGroup10);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locationMappingItor23);
        org.junit.Assert.assertNotNull(locationMappingItor24);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(printStream41);
        org.junit.Assert.assertNotNull(intermediateState43);
        org.junit.Assert.assertNotNull(intermediateState46);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNotNull(intermediateState56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(sourceMap63);
// flaky:         org.junit.Assert.assertNotNull(errorManager64);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(sourceMap70);
// flaky:         org.junit.Assert.assertNotNull(errorManager71);
        org.junit.Assert.assertNotNull(intermediateState72);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(intermediateState78);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNull(sourceMap84);
// flaky:         org.junit.Assert.assertNotNull(errorManager85);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNull(sourceMap91);
// flaky:         org.junit.Assert.assertNotNull(errorManager92);
        org.junit.Assert.assertNotNull(intermediateState93);
        org.junit.Assert.assertNotNull(intermediateStateArray95);
        org.junit.Assert.assertNotNull(intermediateStateArray96);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler1.newExternInput("Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("2019/07/12 07:12", "// Input %num%");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: // Input %num%");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setLabelRenaming(true);
        compilerOptions6.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean11 = compilerOptions6.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format12 = compilerOptions6.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format12);
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing14 = com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP;
        compilerOptions0.setTweakProcessing(tweakProcessing14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions16.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = null;
        compilerOptions16.setCodingConvention(codingConvention19);
        compilerOptions16.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions16.checkProvides;
        java.util.Set<java.lang.String> strSet24 = compilerOptions16.stripTypes;
        java.util.stream.Stream<java.lang.String> strStream25 = strSet24.stream();
        compilerOptions0.stripTypes = strSet24;
        boolean boolean27 = compilerOptions0.smartNameRemoval;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertTrue("'" + tweakProcessing14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP + "'", tweakProcessing14.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.STRIP));
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager9);
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel18 = compilerOptions12.checkGlobalThisLevel;
        compilerOptions0.setCheckUnreachableCode(checkLevel18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet21 = compilerOptions20.stripNamePrefixes;
        byte[] byteArray22 = compilerOptions20.inputVariableMapSerialized;
        compilerOptions20.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler25 = compilerOptions20.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy26 = compilerOptions20.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        double double28 = compiler27.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager29 = null; // flaky: compiler27.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler30 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager29);
        compilerOptions20.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager29);
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions20.aggressiveVarCheck;
        compilerOptions0.setBrokenClosureRequiresLevel(checkLevel32);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel35 = compilerOptions0.checkRequires;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + checkLevel18 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel18.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(byteArray22);
        org.junit.Assert.assertNotNull(aliasTransformationHandler25);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy26 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy26.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel35 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel35.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.TWEAKS = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        compiler13.reportCodeChange();
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset17);
        sourceFile18.setOriginalPath("hi!");
        java.lang.String str21 = sourceFile18.getName();
        com.google.javascript.rhino.Node node22 = null; // flaky: compiler13.parse(sourceFile18);
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler13.getErrorManager();
        boolean boolean24 = locationMappingList1.remove((java.lang.Object) compiler13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions25.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = null;
        compilerOptions25.setCodingConvention(codingConvention28);
        compilerOptions25.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel32 = compilerOptions25.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray33 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList34 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList34, locationMappingArray33);
        compilerOptions25.sourceMapLocationMappings = locationMappingList34;
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        double double38 = compiler37.getProgress();
        compiler37.reportCodeChange();
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.SourceFile sourceFile42 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset41);
        sourceFile42.setOriginalPath("hi!");
        java.lang.String str45 = sourceFile42.getName();
        com.google.javascript.rhino.Node node46 = null; // flaky: compiler37.parse(sourceFile42);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter47 = null; // flaky: compiler37.getReverseAbstractInterpreter();
        boolean boolean48 = locationMappingList34.remove((java.lang.Object) compiler37);
        int int50 = locationMappingList34.indexOf((java.lang.Object) (-1.0d));
        int int51 = locationMappingList34.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions52.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention55 = null;
        compilerOptions52.setCodingConvention(codingConvention55);
        compilerOptions52.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel59 = compilerOptions52.checkProvides;
        java.lang.String[] strArray61 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        compilerOptions52.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList62);
        boolean boolean65 = locationMappingList34.containsAll((java.util.Collection<java.lang.String>) strList62);
        boolean boolean66 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strList62);
        int int67 = locationMappingList1.size();
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node22);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + checkLevel32 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel32.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node46);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + checkLevel59 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel59.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.hasErrors();
        java.lang.String str11 = null; // flaky: compiler0.toSource();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(sourceMap12);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.hasErrors();
        java.lang.String str11 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = compiler0.toSourceArray(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = com.google.javascript.jscomp.SourceFile.builder();
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder2 = builder0.withCharset(charset1);
        com.google.javascript.jscomp.SourceFile.Generator generator4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = builder2.buildFromGenerator("java.io.IOException", generator4);
        boolean boolean6 = sourceFile5.isExtern();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.setNameReferenceReportPath("java.io.IOException: Unversioned directory");
        compilerOptions0.setRewriteFunctionExpressions(false);
        compilerOptions0.setRuntimeTypeCheck(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        com.google.javascript.jscomp.CheckLevel checkLevel12 = compilerOptions0.checkGlobalNamesLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray21 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList22 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList22, locationMappingArray21);
        compilerOptions13.sourceMapLocationMappings = locationMappingList22;
        java.lang.Object[] objArray25 = locationMappingList22.toArray();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor27 = locationMappingList22.listIterator(0);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        double double29 = compiler28.getProgress();
        compiler28.reportCodeChange();
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.SourceFile sourceFile33 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset32);
        sourceFile33.setOriginalPath("hi!");
        java.lang.String str36 = sourceFile33.getName();
        com.google.javascript.rhino.Node node37 = null; // flaky: compiler28.parse(sourceFile33);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter38 = null; // flaky: compiler28.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker39 = compiler28.tracker;
        boolean boolean40 = locationMappingList22.equals((java.lang.Object) compiler28);
        compilerOptions0.sourceMapLocationMappings = locationMappingList22;
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setRewriteNewDateGoogNow(true);
        boolean boolean45 = compilerOptions42.extractPrototypeMemberDeclarations;
        compilerOptions42.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet48 = compilerOptions42.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel49 = null;
        compilerOptions42.setCheckGlobalThisLevel(checkLevel49);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode51 = compilerOptions42.getTracerMode();
        boolean boolean52 = locationMappingList22.remove((java.lang.Object) compilerOptions42);
        compilerOptions42.generateExports = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkLevel12 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel12.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(locationMappingItor27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node37);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter38);
        org.junit.Assert.assertNull(performanceTracker39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + tracerMode51 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode51.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.setCollapseProperties(false);
        compilerOptions3.setClosurePass(true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions3.setInputPropertyMapSerialized(byteArray16);
        compilerOptions3.setFlowSensitiveInlineVariables(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions20.setRewriteNewDateGoogNow(true);
        boolean boolean23 = compilerOptions20.extractPrototypeMemberDeclarations;
        compilerOptions20.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet26 = compilerOptions20.stripTypePrefixes;
        compilerOptions3.aliasableStrings = strSet26;
        boolean boolean28 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strSet26);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup29 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup29;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup29;
        boolean boolean33 = locationMappingList1.contains((java.lang.Object) diagnosticGroup29);
        java.io.IOException iOException36 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException37 = new java.io.IOException("Unversioned directory", (java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException36);
        int int40 = locationMappingList1.indexOf((java.lang.Object) iOException36);
        int int41 = locationMappingList1.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions42.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention45 = null;
        compilerOptions42.setCodingConvention(codingConvention45);
        boolean boolean47 = compilerOptions42.generateExports;
        compilerOptions42.deadAssignmentElimination = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions50.enableExternExports(true);
        com.google.javascript.jscomp.VariableRenamingPolicy variableRenamingPolicy53 = compilerOptions50.variableRenaming;
        compilerOptions42.setVariableRenaming(variableRenamingPolicy53);
        compilerOptions42.printInputDelimiter = false;
        int int57 = locationMappingList1.lastIndexOf((java.lang.Object) compilerOptions42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping59 = locationMappingList1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(diagnosticGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + variableRenamingPolicy53 + "' != '" + com.google.javascript.jscomp.VariableRenamingPolicy.OFF + "'", variableRenamingPolicy53.equals(com.google.javascript.jscomp.VariableRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.disableThreads();
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset7);
        sourceFile8.setOriginalPath("hi!");
        sourceFile8.setOriginalPath("");
        sourceFile8.setOriginalPath("");
        boolean boolean15 = sourceFile8.isExtern();
        java.lang.String str17 = sourceFile8.getLine((int) (byte) 1);
        com.google.javascript.rhino.Node node18 = null; // flaky: compiler0.parse(sourceFile8);
        int int19 = 0; // flaky: compiler0.getWarningCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager9);
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager9);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel18 = compilerOptions12.checkGlobalThisLevel;
        compilerOptions0.setCheckUnreachableCode(checkLevel18);
        compilerOptions0.collapseAnonymousFunctions = false;
        compilerOptions0.inlineConstantVars = true;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + checkLevel18 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel18.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions24.setRewriteNewDateGoogNow(true);
        boolean boolean27 = compilerOptions24.extractPrototypeMemberDeclarations;
        compilerOptions24.convertToDottedProperties = true;
        boolean boolean30 = compilerOptions24.inlineConstantVars;
        boolean boolean31 = compilerOptions24.extractPrototypeMemberDeclarations;
        boolean boolean32 = compilerOptions24.gatherCssNames;
        boolean boolean33 = compilerOptions24.markAsCompiled;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup34 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup34;
        com.google.javascript.jscomp.DiagnosticGroups.EXTERNS_VALIDATION = diagnosticGroup34;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup34;
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions38.setRewriteNewDateGoogNow(true);
        boolean boolean41 = compilerOptions38.extractPrototypeMemberDeclarations;
        boolean boolean42 = compilerOptions38.jqueryPass;
        compilerOptions38.collapseAnonymousFunctions = false;
        java.lang.String str45 = compilerOptions38.aliasStringsBlacklist;
        compilerOptions38.inlineGetters = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        boolean boolean51 = compilerOptions48.extractPrototypeMemberDeclarations;
        boolean boolean52 = compilerOptions48.jqueryPass;
        compilerOptions48.setRemoveUnusedClassProperties(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions55.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention58 = null;
        compilerOptions55.setCodingConvention(codingConvention58);
        compilerOptions55.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions55.checkProvides;
        compilerOptions48.brokenClosureRequiresLevel = checkLevel62;
        compilerOptions38.setCheckGlobalThisLevel(checkLevel62);
        compilerOptions24.setWarningLevel(diagnosticGroup34, checkLevel62);
        int int66 = locationMappingList9.lastIndexOf((java.lang.Object) compilerOptions24);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor68 = locationMappingList9.listIterator(0);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(diagnosticGroup34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(locationMappingItor68);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach10 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions6.setInlineVariables(reach10);
        compilerOptions6.setPrintInputDelimiter(true);
        boolean boolean14 = compilerOptions6.closurePass;
        compilerOptions6.setOutputCharset("java.io.IOException");
// flaky:         compiler0.init(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode18 = compilerOptions6.getLanguageIn();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
// flaky:         org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + reach10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach10.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + languageMode18 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode18.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        com.google.javascript.jscomp.ComposeWarningsGuard composeWarningsGuard9 = null;
        compilerOptions0.setWarningsGuard(composeWarningsGuard9);
        compilerOptions0.setInstrumentationTemplate("2019/07/12 07:12");
        compilerOptions0.setTweakToDoubleLiteral("", (double) 0.0f);
        compilerOptions0.setTweakToBooleanLiteral("java.io.IOException: ", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.lang.String str3 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        compiler7.reportCodeChange();
        java.lang.String str10 = compiler7.getAstDotGraph();
        com.google.javascript.rhino.Node node11 = compiler7.getRoot();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler7.getSourceMap();
        com.google.javascript.jscomp.ErrorManager errorManager13 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState14 = compiler7.getState();
        compiler0.setState(intermediateState14);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter16 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(sourceMap5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(sourceMap12);
// flaky:         org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(intermediateState14);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter16);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.AnonymousFunctionNamingPolicy anonymousFunctionNamingPolicy5 = compilerOptions0.anonymousFunctionNaming;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention9 = null;
        compilerOptions6.setCodingConvention(codingConvention9);
        compilerOptions6.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel13 = compilerOptions6.checkProvides;
        java.lang.String[] strArray15 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        compilerOptions6.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setLabelRenaming(true);
        compilerOptions19.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean24 = compilerOptions19.labelRenaming;
        compilerOptions19.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet28 = compilerOptions27.stripNamePrefixes;
        byte[] byteArray29 = compilerOptions27.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup30 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup30;
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions32.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = null;
        compilerOptions32.setCodingConvention(codingConvention35);
        compilerOptions32.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel39 = compilerOptions32.checkProvides;
        compilerOptions27.setWarningLevel(diagnosticGroup30, checkLevel39);
        compilerOptions19.checkUnreachableCode = checkLevel39;
        compilerOptions6.aggressiveVarCheck = checkLevel39;
        compilerOptions0.aggressiveVarCheck = checkLevel39;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        boolean boolean47 = compilerOptions44.extractPrototypeMemberDeclarations;
        compilerOptions44.setCollapseProperties(false);
        compilerOptions44.setClosurePass(true);
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions44.setInputPropertyMapSerialized(byteArray57);
        compilerOptions44.setAliasAllStrings(false);
        com.google.javascript.jscomp.CheckLevel checkLevel61 = compilerOptions44.reportMissingOverride;
        compilerOptions44.removeUnusedLocalVars = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions64 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions64.setRewriteNewDateGoogNow(true);
        boolean boolean67 = compilerOptions64.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach68 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions64.setInlineVariables(reach68);
        boolean boolean70 = compilerOptions64.removeUnusedVars;
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile73 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str74 = sourceFile73.getOriginalPath();
        com.google.javascript.rhino.Node node75 = null; // flaky: compiler71.parse(sourceFile73);
        double double76 = compiler71.getProgress();
// flaky:         compiler71.check();
        com.google.javascript.jscomp.CodingConvention codingConvention78 = null; // flaky: compiler71.getCodingConvention();
        compilerOptions64.setCodingConvention(codingConvention78);
        compilerOptions44.setCodingConvention(codingConvention78);
        compilerOptions0.setCodingConvention(codingConvention78);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap82 = compilerOptions0.cssRenamingMap;
        org.junit.Assert.assertTrue("'" + anonymousFunctionNamingPolicy5 + "' != '" + com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF + "'", anonymousFunctionNamingPolicy5.equals(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel13 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel13.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertNotNull(diagnosticGroup30);
        org.junit.Assert.assertTrue("'" + checkLevel39 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel39.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + checkLevel61 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel61.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + reach68 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach68.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(sourceFile73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(codingConvention78);
        org.junit.Assert.assertNull(cssRenamingMap82);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream(file0, "java.io.IOException: java.io.IOException: 2019/07/12 07:12");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        compilerOptions0.removeUnusedPrototypePropertiesInExterns = false;
        com.google.javascript.jscomp.WarningsGuard warningsGuard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        int int26 = locationMappingList9.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        java.lang.String[] strArray36 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        compilerOptions27.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList37);
        boolean boolean40 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList37);
        java.lang.Object[] objArray41 = locationMappingList9.toArray();
        java.lang.Object[] objArray42 = locationMappingList9.toArray();
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray43 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList44 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList44, locationMappingArray43);
        java.lang.String[] strArray53 = new java.lang.String[] { "// Input %num%", "java.io.IOException", "", "// Input %num%", "java.io.IOException: java.io.IOException: 2019/07/12 07:12", "Unversioned directory", "java.io.IOException: java.io.IOException: 2019/07/12 07:12" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = locationMappingList44.removeAll((java.util.Collection<java.lang.String>) strList54);
        boolean boolean57 = locationMappingList9.removeAll((java.util.Collection<java.lang.String>) strList54);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(locationMappingArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        boolean boolean8 = compilerOptions0.shouldColorizeErrorOutput();
        java.util.List<java.lang.String> strList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setManageClosureDependencies(strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.util.Set<java.lang.String> strSet8 = compilerOptions0.stripTypes;
        boolean boolean9 = compilerOptions0.inlineFunctions;
        compilerOptions0.setColorizeErrorOutput(false);
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.GLOBAL_THIS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.WarningsGuard warningsGuard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        boolean boolean8 = compilerOptions0.assumeStrictThis();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = null; // flaky: compiler0.getErrorManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler0.toSourceArray();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
// flaky:         org.junit.Assert.assertNotNull(errorManager3);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        java.util.Set<java.lang.String> strSet3 = compilerOptions0.stripTypes;
        compilerOptions0.inlineFunctions = false;
        boolean boolean6 = compilerOptions0.inlineVariables;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        double double12 = compiler11.getProgress();
        compiler11.reportCodeChange();
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler11.getState();
        compiler0.setState(intermediateState16);
        com.google.javascript.jscomp.ErrorManager errorManager18 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler0.getSourceMap();
        com.google.javascript.rhino.InputId inputId20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput21 = compiler0.getInput(inputId20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(intermediateState16);
// flaky:         org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNull(sourceMap19);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        java.lang.Object[] objArray12 = locationMappingList9.toArray();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor14 = locationMappingList9.listIterator(0);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        compiler15.reportCodeChange();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset19);
        sourceFile20.setOriginalPath("hi!");
        java.lang.String str23 = sourceFile20.getName();
        com.google.javascript.rhino.Node node24 = null; // flaky: compiler15.parse(sourceFile20);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter25 = null; // flaky: compiler15.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = compiler15.tracker;
        boolean boolean27 = locationMappingList9.equals((java.lang.Object) compiler15);
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.SourceFile sourceFile30 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset29);
        sourceFile30.setOriginalPath("hi!");
        sourceFile30.setOriginalPath("");
        sourceFile30.setOriginalPath("");
        int int37 = locationMappingList9.indexOf((java.lang.Object) sourceFile30);
        com.google.javascript.jscomp.SourceFile.Builder builder38 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator40 = null;
        com.google.javascript.jscomp.SourceFile sourceFile41 = builder38.buildFromGenerator("hi!", generator40);
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder43 = builder38.withCharset(charset42);
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder45 = builder38.withCharset(charset44);
        com.google.javascript.jscomp.SourceFile.Builder builder47 = builder38.withOriginalPath("Unversioned directory");
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder49 = builder47.withCharset(charset48);
        com.google.javascript.jscomp.SourceFile.Builder builder51 = builder49.withOriginalPath("java.io.IOException");
        boolean boolean52 = locationMappingList9.contains((java.lang.Object) builder49);
        com.google.javascript.jscomp.SourceFile sourceFile54 = builder49.buildFromFile("hi!");
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(locationMappingItor14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node24);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter25);
        org.junit.Assert.assertNull(performanceTracker26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sourceFile30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(sourceFile41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sourceFile54);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        java.lang.String str6 = compiler0.getSourceLine("Unversioned directory", (int) (byte) -1);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = null;
        compiler0.tracker = performanceTracker7;
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compilerOptions9.setCodingConvention(codingConvention12);
        boolean boolean14 = compilerOptions9.generateExports;
        compilerOptions9.gatherCssNames = false;
        com.google.javascript.jscomp.CompilerOptions.TweakProcessing tweakProcessing17 = compilerOptions9.getTweakProcessing();
        compilerOptions9.setProtectHiddenSideEffects(true);
        boolean boolean20 = compilerOptions9.crossModuleMethodMotion;
        compilerOptions9.setDefineToBooleanLiteral("java.io.IOException: Unversioned directory", true);
// flaky:         compiler0.initOptions(compilerOptions9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tweakProcessing17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF + "'", tweakProcessing17.equals(com.google.javascript.jscomp.CompilerOptions.TweakProcessing.OFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager2 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager3 = null; // flaky: compiler0.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setRewriteNewDateGoogNow(true);
        boolean boolean9 = compilerOptions6.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach10 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions6.setInlineVariables(reach10);
        compilerOptions6.setPrintInputDelimiter(true);
        boolean boolean14 = compilerOptions6.closurePass;
        compilerOptions6.setOutputCharset("java.io.IOException");
// flaky:         compiler0.init(jSSourceFileArray4, jSSourceFileArray5, compilerOptions6);
        boolean boolean18 = compilerOptions6.disambiguateProperties;
        compilerOptions6.setSummaryDetailLevel((int) (short) 100);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.enableExternExports(true);
        java.util.Set<java.lang.String> strSet24 = compilerOptions21.stripTypes;
        compilerOptions21.inlineFunctions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet28 = compilerOptions27.stripNamePrefixes;
        byte[] byteArray29 = compilerOptions27.inputVariableMapSerialized;
        com.google.javascript.jscomp.CompilerOptions.Reach reach30 = com.google.javascript.jscomp.CompilerOptions.Reach.NONE;
        compilerOptions27.setInlineFunctions(reach30);
        compilerOptions21.setInlineFunctions(reach30);
        compilerOptions6.setInlineVariables(reach30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager2);
// flaky:         org.junit.Assert.assertNotNull(errorManager3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + reach10 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach10.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertTrue("'" + reach30 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.NONE + "'", reach30.equals(com.google.javascript.jscomp.CompilerOptions.Reach.NONE));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.convertToDottedProperties;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        boolean boolean11 = false; // flaky: compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable12 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        java.io.PrintStream printStream22 = printStream1.append((java.lang.CharSequence) "");
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        double double25 = compiler24.getProgress();
        compiler24.reportCodeChange();
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.SourceFile sourceFile29 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset28);
        sourceFile29.setOriginalPath("hi!");
        java.lang.String str32 = sourceFile29.getName();
        com.google.javascript.rhino.Node node33 = null; // flaky: compiler24.parse(sourceFile29);
        boolean boolean34 = false; // flaky: compiler24.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray36 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        double double38 = compiler37.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager39 = null; // flaky: compiler37.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager40 = null; // flaky: compiler37.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray42 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions43.setRewriteNewDateGoogNow(true);
        boolean boolean46 = compilerOptions43.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach47 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions43.setInlineVariables(reach47);
        compilerOptions43.setPrintInputDelimiter(true);
        boolean boolean51 = compilerOptions43.closurePass;
        compilerOptions43.setOutputCharset("java.io.IOException");
// flaky:         compiler37.init(jSSourceFileArray41, jSSourceFileArray42, compilerOptions43);
// flaky:         compiler24.init(jSSourceFileArray35, jSModuleArray36, compilerOptions43);
        java.io.PrintStream printStream56 = printStream22.printf("", (java.lang.Object[]) jSSourceFileArray35);
        printStream56.close();
        printStream56.println((double) 0L);
        java.io.PrintStream printStream61 = new java.io.PrintStream((java.io.OutputStream) printStream56, false);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup18);
        org.junit.Assert.assertNotNull(printStream22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node33);
// flaky:         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray35);
        org.junit.Assert.assertNotNull(jSModuleArray36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager39);
// flaky:         org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertNotNull(jSSourceFileArray42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + reach47 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach47.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(printStream56);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        compiler0.disableThreads();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        compilerOptions39.setInlineGetters(false);
        boolean boolean46 = compilerOptions39.gatherCssNames;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        double double12 = compiler0.getProgress();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.STRICT_MODULE_DEP_CHECK = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Generator generator5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = builder0.buildFromGenerator("hi!", generator5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile6.getLineOfOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(sourceFile6);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        java.lang.String str7 = compilerOptions0.aliasStringsBlacklist;
        compilerOptions0.inlineGetters = false;
        boolean boolean10 = compilerOptions0.exportTestFunctions;
        compilerOptions0.setDefineToDoubleLiteral("Unversioned directory", (double) 100);
        compilerOptions0.setLineBreak(true);
        boolean boolean16 = compilerOptions0.ambiguateProperties;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions11.setRewriteNewDateGoogNow(true);
        boolean boolean14 = compilerOptions11.extractPrototypeMemberDeclarations;
        compilerOptions11.convertToDottedProperties = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention20 = null;
        compilerOptions17.setCodingConvention(codingConvention20);
        compilerOptions17.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel24 = compilerOptions17.checkProvides;
        compilerOptions11.setReportUnknownTypes(checkLevel24);
        compilerOptions0.setCheckGlobalNamesLevel(checkLevel24);
        compilerOptions0.checkMissingGetCssNameBlacklist = "";
        compilerOptions0.setLineBreak(true);
        boolean boolean31 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup32 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup32;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup32;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup32;
        com.google.javascript.jscomp.DiagnosticGroups.TYPE_INVALIDATION = diagnosticGroup32;
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        boolean boolean40 = compilerOptions37.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach41 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions37.setInlineVariables(reach41);
        compilerOptions37.setPrintInputDelimiter(true);
        boolean boolean45 = compilerOptions37.closurePass;
        com.google.javascript.jscomp.MessageBundle messageBundle46 = null;
        compilerOptions37.messageBundle = messageBundle46;
        compilerOptions37.setDeadAssignmentElimination(false);
        boolean boolean50 = compilerOptions37.optimizeParameters;
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        boolean boolean54 = compilerOptions51.extractPrototypeMemberDeclarations;
        boolean boolean55 = compilerOptions51.jqueryPass;
        compilerOptions51.collapseAnonymousFunctions = false;
        boolean boolean58 = compilerOptions51.checkTypes;
        compilerOptions51.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions61.setLabelRenaming(true);
        compilerOptions61.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean66 = compilerOptions61.labelRenaming;
        compilerOptions61.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions69 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet70 = compilerOptions69.stripNamePrefixes;
        byte[] byteArray71 = compilerOptions69.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup72 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup72;
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions74.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention77 = null;
        compilerOptions74.setCodingConvention(codingConvention77);
        compilerOptions74.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel81 = compilerOptions74.checkProvides;
        compilerOptions69.setWarningLevel(diagnosticGroup72, checkLevel81);
        compilerOptions61.checkUnreachableCode = checkLevel81;
        compilerOptions51.checkProvides = checkLevel81;
        compilerOptions37.setCheckGlobalThisLevel(checkLevel81);
        compilerOptions0.setWarningLevel(diagnosticGroup32, checkLevel81);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel24 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel24.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(diagnosticGroup32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + reach41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach41.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNull(byteArray71);
        org.junit.Assert.assertNotNull(diagnosticGroup72);
        org.junit.Assert.assertTrue("'" + checkLevel81 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel81.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Builder builder11 = builder9.withOriginalPath("2019/07/12 07:12");
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = builder11.buildFromInputStream("Unversioned directory", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setInlineLocalVariables(true);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap11 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setRemoveClosureAsserts(false);
        org.junit.Assert.assertNull(cssRenamingMap11);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        compilerOptions0.setClosurePass(true);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray13);
        compilerOptions0.setCheckControlStructures(true);
        compilerOptions0.setInlineLocalFunctions(true);
        compilerOptions0.setAmbiguateProperties(false);
        boolean boolean21 = compilerOptions0.getInferTypes();
        compilerOptions0.setGeneratePseudoNames(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("hi!", "java.io.IOException: Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: java.io.IOException: Unversioned directory");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.NON_STANDARD_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.setOriginalPath("");
        sourceFile2.setOriginalPath("");
        java.lang.String str9 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = sourceFile2.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        boolean boolean16 = compilerOptions13.extractPrototypeMemberDeclarations;
        compilerOptions13.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions13.checkGlobalThisLevel;
        compilerOptions0.checkMissingReturn = checkLevel19;
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        compilerOptions0.setDefineReplacements(strMap21);
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        boolean boolean27 = compilerOptions23.jqueryPass;
        compilerOptions23.collapseAnonymousFunctions = false;
        java.lang.String str30 = compilerOptions23.aliasStringsBlacklist;
        compilerOptions23.inlineGetters = false;
        boolean boolean33 = compilerOptions23.exportTestFunctions;
        compilerOptions23.setDefineToDoubleLiteral("Unversioned directory", (double) 100);
        compilerOptions23.preferLineBreakAtEndOfFile = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setRewriteNewDateGoogNow(true);
        compilerOptions39.setCheckSuspiciousCode(true);
        compilerOptions39.setConvertToDottedProperties(false);
        compilerOptions39.setFoldConstants(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions48.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention51 = null;
        compilerOptions48.setCodingConvention(codingConvention51);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode53 = compilerOptions48.getTracerMode();
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup54 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup54;
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions56.setRewriteNewDateGoogNow(true);
        boolean boolean59 = compilerOptions56.extractPrototypeMemberDeclarations;
        compilerOptions56.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel62 = compilerOptions56.brokenClosureRequiresLevel;
        compilerOptions48.setWarningLevel(diagnosticGroup54, checkLevel62);
        com.google.javascript.jscomp.CheckLevel checkLevel64 = compilerOptions48.checkGlobalThisLevel;
        compilerOptions39.setCheckProvides(checkLevel64);
        compilerOptions23.setAggressiveVarCheck(checkLevel64);
        compilerOptions0.setBrokenClosureRequiresLevel(checkLevel64);
        compilerOptions0.removeUnusedVars = false;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tracerMode53 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode53.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertNotNull(diagnosticGroup54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + checkLevel62 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel62.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel64 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel64.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.CheckLevel checkLevel9 = compilerOptions0.checkMissingGetCssNameLevel;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet11 = compilerOptions10.stripNamePrefixes;
        byte[] byteArray12 = compilerOptions10.inputVariableMapSerialized;
        boolean boolean13 = compilerOptions10.exportTestFunctions;
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setLabelRenaming(true);
        compilerOptions14.syntheticBlockStartMarker = "java.io.IOException";
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions14.checkGlobalThisLevel;
        compilerOptions10.setCheckGlobalNamesLevel(checkLevel19);
        compilerOptions0.setCheckMissingGetCssNameLevel(checkLevel19);
        boolean boolean22 = compilerOptions0.printInputDelimiter;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel9 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel9.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        boolean boolean16 = compilerOptions12.jqueryPass;
        compilerOptions12.collapseAnonymousFunctions = false;
        java.lang.String str19 = compilerOptions12.aliasStringsBlacklist;
        boolean boolean20 = locationMappingList9.equals((java.lang.Object) str19);
        java.util.function.UnaryOperator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList9.replaceAll(locationMappingUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup18 = com.google.javascript.jscomp.DiagnosticGroups.ES5_STRICT;
        printStream1.println((java.lang.Object) diagnosticGroup18);
        java.io.PrintStream printStream20 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler(printStream1);
        com.google.javascript.jscomp.JsAst jsAst22 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler21.replaceScript(jsAst22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(diagnosticGroup18);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        java.lang.String str3 = compilerOptions0.sourceMapOutputPath;
        compilerOptions0.setPrettyPrint(false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        compilerOptions0.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList10);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setLabelRenaming(true);
        compilerOptions13.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean18 = compilerOptions13.labelRenaming;
        compilerOptions13.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet22 = compilerOptions21.stripNamePrefixes;
        byte[] byteArray23 = compilerOptions21.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup24 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup24;
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions26.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention29 = null;
        compilerOptions26.setCodingConvention(codingConvention29);
        compilerOptions26.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel33 = compilerOptions26.checkProvides;
        compilerOptions21.setWarningLevel(diagnosticGroup24, checkLevel33);
        compilerOptions13.checkUnreachableCode = checkLevel33;
        compilerOptions0.aggressiveVarCheck = checkLevel33;
        byte[] byteArray37 = compilerOptions0.inputPropertyMapSerialized;
        boolean boolean38 = compilerOptions0.removeUnusedLocalVars;
        boolean boolean39 = compilerOptions0.recordFunctionInformation;
        boolean boolean40 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(byteArray23);
        org.junit.Assert.assertNotNull(diagnosticGroup24);
        org.junit.Assert.assertTrue("'" + checkLevel33 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel33.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(byteArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode3 = com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY;
        compilerOptions0.setTracer(tracerMode3);
        compilerOptions0.setSmartNameRemoval(false);
        compilerOptions0.setLooseTypes(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compilerOptions9.setCodingConvention(codingConvention12);
        compilerOptions9.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel16 = compilerOptions9.checkProvides;
        compilerOptions0.setBrokenClosureRequiresLevel(checkLevel16);
        org.junit.Assert.assertTrue("'" + tracerMode3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY + "'", tracerMode3.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.TIMING_ONLY));
        org.junit.Assert.assertTrue("'" + checkLevel16 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel16.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        compilerOptions0.locale = "2019/07/12 07:12";
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.setRuntimeTypeCheck(true);
        compilerOptions0.inlineVariables = false;
        compilerOptions0.aliasAllStrings = false;
        compilerOptions0.setProcessObjectPropertyString(false);
        org.junit.Assert.assertNull(cssRenamingMap7);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException: ");
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10 };
        compilerOptions0.setInputPropertyMapSerialized(byteArray15);
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.reportMissingOverride;
        com.google.javascript.jscomp.DependencyOptions dependencyOptions18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setDependencyOptions(dependencyOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 10]");
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        com.google.javascript.jscomp.WarningsGuard warningsGuard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        sourceFile1.setOriginalPath("");
        java.lang.String str8 = sourceFile1.getLine((int) (short) 100);
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("java.io.IOException: ", "");
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setAcceptConstKeyword(false);
        com.google.javascript.jscomp.SourceMap.Format format9 = compilerOptions0.sourceMapFormat;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(format9);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder7 = builder0.withCharset(charset6);
        com.google.javascript.jscomp.SourceFile.Builder builder9 = builder0.withOriginalPath("Unversioned directory");
        com.google.javascript.jscomp.SourceFile.Generator generator11 = null;
        com.google.javascript.jscomp.SourceFile sourceFile12 = builder9.buildFromGenerator("java.io.IOException: ", generator11);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = builder9.buildFromFile(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        compilerOptions0.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean5 = compilerOptions0.labelRenaming;
        compilerOptions0.ambiguateProperties = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet9 = compilerOptions8.stripNamePrefixes;
        byte[] byteArray10 = compilerOptions8.inputVariableMapSerialized;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup11 = com.google.javascript.jscomp.DiagnosticGroups.CONSTANT_PROPERTY;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup11;
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions13.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compilerOptions13.setCodingConvention(codingConvention16);
        compilerOptions13.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel20 = compilerOptions13.checkProvides;
        compilerOptions8.setWarningLevel(diagnosticGroup11, checkLevel20);
        compilerOptions0.checkUnreachableCode = checkLevel20;
        compilerOptions0.setAliasableGlobals("");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray25 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList26 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList26, locationMappingArray25);
        com.google.javascript.jscomp.SourceFile sourceFile30 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "java.io.IOException: ");
        boolean boolean31 = locationMappingList26.remove((java.lang.Object) "hi!");
        boolean boolean32 = locationMappingList26.isEmpty();
        compilerOptions0.setSourceMapLocationMappings((java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping35 = locationMappingList26.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(diagnosticGroup11);
        org.junit.Assert.assertTrue("'" + checkLevel20 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel20.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sourceFile30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.flowSensitiveInlineVariables = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet16 = compilerOptions10.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel17 = null;
        compilerOptions10.setCheckGlobalThisLevel(checkLevel17);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode19 = compilerOptions10.getTracerMode();
        compilerOptions0.setTracer(tracerMode19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        boolean boolean29 = compilerOptions21.smartNameRemoval;
        java.util.Set<java.lang.String> strSet30 = compilerOptions21.aliasableStrings;
        compilerOptions0.stripNamePrefixes = strSet30;
        boolean boolean32 = compilerOptions0.removeUnusedLocalVars;
        compilerOptions0.collapseProperties = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + tracerMode19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode19.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode5 = compilerOptions0.getTracerMode();
        compilerOptions0.lineBreak = false;
        compilerOptions0.setAssumeClosuresOnlyCaptureReferences(false);
        compilerOptions0.recordFunctionInformation = false;
        boolean boolean12 = compilerOptions0.moveFunctionDeclarations;
        org.junit.Assert.assertTrue("'" + tracerMode5 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode5.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Generator generator5 = null;
        com.google.javascript.jscomp.SourceFile sourceFile6 = builder0.buildFromGenerator("hi!", generator5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile6.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(sourceFile6);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        boolean boolean5 = compilerOptions0.deadAssignmentElimination;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions6.setLabelRenaming(true);
        compilerOptions6.syntheticBlockStartMarker = "java.io.IOException";
        boolean boolean11 = compilerOptions6.isExternExportsEnabled();
        com.google.javascript.jscomp.SourceMap.Format format12 = compilerOptions6.sourceMapFormat;
        compilerOptions0.setSourceMapFormat(format12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        compilerOptions14.setCollapseProperties(false);
        compilerOptions14.setClosurePass(true);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions14.setInputPropertyMapSerialized(byteArray27);
        compilerOptions14.setFlowSensitiveInlineVariables(true);
        boolean boolean31 = compilerOptions14.exportTestFunctions;
        compilerOptions14.closurePass = false;
        com.google.javascript.jscomp.ErrorFormat errorFormat34 = compilerOptions14.errorFormat;
        compilerOptions0.setErrorFormat(errorFormat34);
        compilerOptions0.aliasStringsBlacklist = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        com.google.javascript.jscomp.SourceMap.Format format38 = compilerOptions0.sourceMapFormat;
        compilerOptions0.inlineConstantVars = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(format12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(errorFormat34);
        org.junit.Assert.assertNotNull(format38);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        compilerOptions0.aliasAllStrings = false;
        boolean boolean9 = compilerOptions0.smartNameRemoval;
        compilerOptions0.gatherCssNames = true;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap12 = null;
        compilerOptions0.setCustomPasses(customPassExecutionTimeMultimap12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions14.setRewriteNewDateGoogNow(true);
        boolean boolean17 = compilerOptions14.extractPrototypeMemberDeclarations;
        boolean boolean18 = compilerOptions14.assumeClosuresOnlyCaptureReferences();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap19 = null;
        compilerOptions14.setCssRenamingMap(cssRenamingMap19);
        com.google.javascript.jscomp.CheckLevel checkLevel21 = compilerOptions14.reportMissingOverride;
        compilerOptions0.checkRequires = checkLevel21;
        compilerOptions0.setRemoveTryCatchFinally(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + checkLevel21 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel21.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_PROVIDES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.aliasKeywords;
        compilerOptions0.setAliasStringsBlacklist("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        byte[] byteArray11 = null;
        compilerOptions0.setInputVariableMapSerialized(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        int int4 = sourceFile2.getColumnOfOffset(10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES;
        com.google.javascript.jscomp.DiagnosticGroups.DEBUGGER_STATEMENT_PRESENT = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.jqueryPass;
        compilerOptions0.collapseAnonymousFunctions = false;
        java.lang.String str7 = compilerOptions0.aliasStringsBlacklist;
        com.google.javascript.jscomp.WarningsGuard warningsGuard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.addWarningsGuard(warningsGuard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withCharset(charset4);
        com.google.javascript.jscomp.SourceFile.Generator generator7 = null;
        com.google.javascript.jscomp.SourceFile sourceFile8 = builder5.buildFromGenerator("hi!", generator7);
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.SourceFile.Builder builder10 = builder5.withCharset(charset9);
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = builder10.buildFromReader("", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        compilerOptions0.setNameReferenceGraphPath("Unversioned directory");
        boolean boolean6 = compilerOptions0.removeTryCatchFinally;
        byte[] byteArray7 = compilerOptions0.inputVariableMapSerialized;
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = null;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor13 = locationMappingList1.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList16 = locationMappingList1.subList(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locationMappingItor13);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        java.lang.Class<?> wildcardClass14 = compilerOptions0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream8 = new java.io.PrintStream((java.io.OutputStream) printStream1);
        com.google.javascript.jscomp.SourceFile.Builder builder10 = new com.google.javascript.jscomp.SourceFile.Builder();
        java.io.IOException iOException12 = new java.io.IOException("2019/07/12 07:12");
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Object[] objArray15 = new java.lang.Object[] { builder10, iOException13, (byte) 10 };
        java.io.PrintStream printStream16 = printStream8.printf("", objArray15);
        printStream16.println((float) (-1L));
        java.io.PrintStream printStream20 = printStream16.append('#');
        printStream16.println();
        printStream16.print((-1L));
        printStream16.print((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(printStream16);
        org.junit.Assert.assertNotNull(printStream20);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.FILEOVERVIEW_JSDOC = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_TYPES = diagnosticGroup0;
        org.junit.Assert.assertNull(diagnosticGroup0);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        compilerOptions0.setLocale("java.io.IOException: java.io.IOException: 2019/07/12 07:12");
        boolean boolean9 = compilerOptions0.deadAssignmentElimination;
        compilerOptions0.optimizeCalls = false;
        compilerOptions0.instrumentationTemplate = "java.io.IOException: java.io.IOException: 2019/07/12 07:12";
        boolean boolean14 = compilerOptions0.jqueryPass;
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions15.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention18 = null;
        compilerOptions15.setCodingConvention(codingConvention18);
        compilerOptions15.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel22 = compilerOptions15.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray23 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList24 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList24, locationMappingArray23);
        compilerOptions15.sourceMapLocationMappings = locationMappingList24;
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        boolean boolean31 = compilerOptions27.jqueryPass;
        compilerOptions27.collapseAnonymousFunctions = false;
        boolean boolean34 = compilerOptions27.checkTypes;
        compilerOptions27.setRemoveTryCatchFinally(false);
        com.google.javascript.jscomp.CheckLevel checkLevel37 = compilerOptions27.checkProvides;
        compilerOptions15.checkUnreachableCode = checkLevel37;
        compilerOptions15.rewriteFunctionExpressions = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions41.setRewriteNewDateGoogNow(true);
        boolean boolean44 = compilerOptions41.extractPrototypeMemberDeclarations;
        boolean boolean45 = compilerOptions41.jqueryPass;
        compilerOptions41.collapseAnonymousFunctions = false;
        boolean boolean48 = compilerOptions41.checkTypes;
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions49.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention52 = null;
        compilerOptions49.setCodingConvention(codingConvention52);
        compilerOptions49.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet57 = compilerOptions56.stripNamePrefixes;
        compilerOptions49.setIdGenerators(strSet57);
        compilerOptions41.stripNamePrefixes = strSet57;
        compilerOptions15.setIdGenerators(strSet57);
        compilerOptions0.stripTypePrefixes = strSet57;
        compilerOptions0.setDefineToStringLiteral("// Input %num%", "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + checkLevel22 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel22.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + checkLevel37 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel37.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strSet57);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler1.getWarnings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions3.setRewriteNewDateGoogNow(true);
        boolean boolean6 = compilerOptions3.extractPrototypeMemberDeclarations;
        compilerOptions3.convertToDottedProperties = true;
        boolean boolean9 = compilerOptions3.inlineConstantVars;
        boolean boolean10 = compilerOptions3.extractPrototypeMemberDeclarations;
        boolean boolean11 = compilerOptions3.reserveRawExports;
        boolean boolean12 = locationMappingList1.remove((java.lang.Object) boolean11);
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor13 = locationMappingList1.listIterator();
        java.util.Iterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor14 = locationMappingList1.iterator();
        com.google.javascript.jscomp.SourceMap.LocationMapping locationMapping16 = null;
        // The following exception was thrown during execution in test generation
        try {
            locationMappingList1.add(1, locationMapping16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locationMappingItor13);
        org.junit.Assert.assertNotNull(locationMappingItor14);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.DUPLICATE_VARS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.INTERNET_EXPLORER_CHECKS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.rhino.Node node3 = compiler1.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler1.getReverseAbstractInterpreter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel6 = compilerOptions0.checkGlobalThisLevel;
        compilerOptions0.setDevirtualizePrototypeMethods(true);
        com.google.javascript.jscomp.MessageBundle messageBundle9 = null;
        compilerOptions0.setMessageBundle(messageBundle9);
        boolean boolean11 = compilerOptions0.recordFunctionInformation;
        java.util.Set<java.lang.String> strSet12 = compilerOptions0.stripTypePrefixes;
        compilerOptions0.setPrintInputDelimiter(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + checkLevel6 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel6.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler1.getMessages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream2 = new java.io.PrintStream("// Input %num%", "Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Unversioned directory");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup0 = com.google.javascript.jscomp.DiagnosticGroups.MISSING_PROPERTIES;
        com.google.javascript.jscomp.DiagnosticGroups.INVALID_CASTS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_REGEXP = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES = diagnosticGroup0;
        com.google.javascript.jscomp.DiagnosticGroups.UNKNOWN_DEFINES = diagnosticGroup0;
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup0);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setDefineToBooleanLiteral("hi!", true);
        compilerOptions0.optimizeCalls = true;
        compilerOptions0.checkTypes = false;
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet8 = compilerOptions7.stripNamePrefixes;
        compilerOptions0.setIdGenerators(strSet8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = null;
        compilerOptions10.setCodingConvention(codingConvention13);
        compilerOptions10.setGeneratePseudoNames(true);
        compilerOptions10.inlineLocalFunctions = false;
        compilerOptions10.setIdeMode(true);
        compilerOptions10.computeFunctionSideEffects = false;
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions23.setRewriteNewDateGoogNow(true);
        boolean boolean26 = compilerOptions23.extractPrototypeMemberDeclarations;
        compilerOptions23.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel29 = compilerOptions23.checkGlobalThisLevel;
        compilerOptions10.checkMissingReturn = checkLevel29;
        compilerOptions0.aggressiveVarCheck = checkLevel29;
        compilerOptions0.setDebugFunctionSideEffectsPath("hi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + checkLevel29 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel29.equals(com.google.javascript.jscomp.CheckLevel.OFF));
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean4 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.crossModuleCodeMotion = false;
        java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerOptions0.setPropertyInvalidationErrors(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("java.io.IOException: java.io.IOException: 2019/07/12 07:12", "java.io.IOException", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        com.google.javascript.jscomp.SourceFile.Builder builder5 = builder0.withOriginalPath("hi!");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile7 = builder0.buildFromFile(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream11.println();
        printStream11.print('4');
        // The following exception was thrown during execution in test generation
        try {
            java.io.PrintStream printStream18 = printStream11.append((java.lang.CharSequence) "java.io.IOException: ", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet6 = compilerOptions0.stripTypePrefixes;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compilerOptions0.cssRenamingMap;
        compilerOptions0.reserveRawExports = true;
        compilerOptions0.setInlineConstantVars(true);
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        boolean boolean15 = compilerOptions12.extractPrototypeMemberDeclarations;
        compilerOptions12.convertToDottedProperties = true;
        compilerOptions12.setRemoveUnusedVars(true);
        boolean boolean20 = compilerOptions12.labelRenaming;
        boolean boolean21 = compilerOptions12.inlineVariables;
        compilerOptions12.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap.Format format24 = compilerOptions12.sourceMapFormat;
        compilerOptions0.sourceMapFormat = format24;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(cssRenamingMap7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(format24);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        compilerOptions0.collapseProperties = false;
        compilerOptions0.setCollapseProperties(false);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("hi!");
        int int6 = sourceFile2.getLineOfOffset((int) (short) 10);
        boolean boolean7 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader8 = sourceFile2.getCodeReader();
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("", "java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream1.write(byteArray14, (int) (byte) 0, (int) (byte) 1);
        java.io.PrintStream printStream19 = new java.io.PrintStream("Unversioned directory");
        char[] charArray22 = new char[] { '4', '4' };
        printStream19.print(charArray22);
        printStream19.print((int) ' ');
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        printStream19.write(byteArray32, (int) (byte) 0, (int) (byte) 1);
        char[] charArray42 = new char[] { ' ', '#', '4', 'a', '#', 'a' };
        printStream19.print(charArray42);
        printStream1.println(charArray42);
        printStream1.println((long) '#');
        printStream1.println((float) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, 4]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 10, 100, 100, 100]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " #4a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , #, 4, a, #, a]");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.rhino.Node node3 = compiler0.getRoot();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        double double5 = compiler4.getProgress();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        compiler4.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState9 = compiler4.getState();
        compiler0.setState(intermediateState9);
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel12 = compiler0.getErrorLevel(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(intermediateState9);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        java.lang.String str3 = compilerOptions0.sourceMapOutputPath;
        compilerOptions0.aliasKeywords = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet7 = compilerOptions6.stripNamePrefixes;
        byte[] byteArray8 = compilerOptions6.inputVariableMapSerialized;
        compilerOptions6.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler11 = compilerOptions6.getAliasTransformationHandler();
        compilerOptions0.setAliasTransformationHandler(aliasTransformationHandler11);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.jscomp.CompilerOptions.AliasTransformation> aliasTransformationSourcePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.AliasTransformation aliasTransformation15 = aliasTransformationHandler11.logAliasTransformation("java.io.IOException: java.io.IOException: 2019/07/12 07:12", aliasTransformationSourcePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(byteArray8);
        org.junit.Assert.assertNotNull(aliasTransformationHandler11);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setLabelRenaming(true);
        com.google.javascript.jscomp.CheckLevel checkLevel3 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CheckLevel checkLevel4 = compilerOptions0.reportMissingOverride;
        compilerOptions0.checkControlStructures = true;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = null;
        compilerOptions0.cssRenamingMap = cssRenamingMap7;
        byte[] byteArray9 = compilerOptions0.inputPropertyMapSerialized;
        org.junit.Assert.assertTrue("'" + checkLevel3 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel3.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel4 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel4.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNull(byteArray9);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach4 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions0.setInlineVariables(reach4);
        boolean boolean6 = compilerOptions0.removeUnusedVars;
        boolean boolean7 = compilerOptions0.assumeClosuresOnlyCaptureReferences();
        compilerOptions0.setCheckControlStructures(true);
        compilerOptions0.aliasExternals = true;
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        compilerOptions0.sourceMapDetailLevel = detailLevel12;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + reach4 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach4.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray0 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList1 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList1, locationMappingArray0);
        java.lang.String[] strArray10 = new java.lang.String[] { "// Input %num%", "java.io.IOException", "", "// Input %num%", "java.io.IOException: java.io.IOException: 2019/07/12 07:12", "Unversioned directory", "java.io.IOException: java.io.IOException: 2019/07/12 07:12" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        boolean boolean13 = locationMappingList1.removeAll((java.util.Collection<java.lang.String>) strList11);
        java.util.Spliterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingSpliterator14 = locationMappingList1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList17 = locationMappingList1.subList((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locationMappingArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locationMappingSpliterator14);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("java.io.IOException: Unversioned directory", "2019/07/12 07:12", "// Input %num%");
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = compiler1.toSourceArray(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions44.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention47 = null;
        compilerOptions44.setCodingConvention(codingConvention47);
        compilerOptions44.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel51 = compilerOptions44.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray52 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList53 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList53, locationMappingArray52);
        compilerOptions44.sourceMapLocationMappings = locationMappingList53;
        com.google.javascript.jscomp.CheckLevel checkLevel56 = compilerOptions44.aggressiveVarCheck;
        compilerOptions39.checkProvides = checkLevel56;
        boolean boolean58 = compilerOptions39.collapseAnonymousFunctions;
        boolean boolean59 = compilerOptions39.gatherCssNames;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + checkLevel51 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel51.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + checkLevel56 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel56.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup3 = com.google.javascript.jscomp.DiagnosticGroups.CHECK_VARIABLES;
        com.google.javascript.jscomp.DiagnosticGroups.ACCESS_CONTROLS = diagnosticGroup3;
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup5 = com.google.javascript.jscomp.DiagnosticGroups.TWEAKS;
        com.google.javascript.jscomp.SourceFile.Builder builder6 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator8 = null;
        com.google.javascript.jscomp.SourceFile sourceFile9 = builder6.buildFromGenerator("hi!", generator8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { diagnosticGroup3, diagnosticGroup5, sourceFile9 };
        java.io.PrintStream printStream11 = printStream1.printf("2019/07/12 07:12", objArray10);
        printStream11.println();
        printStream11.write((int) (byte) 100);
        printStream11.println(true);
        printStream11.print("");
        java.io.PrintStream printStream20 = new java.io.PrintStream("Unversioned directory");
        char[] charArray23 = new char[] { '4', '4' };
        printStream20.print(charArray23);
        printStream20.print((int) ' ');
        java.io.PrintStream printStream28 = new java.io.PrintStream((java.io.OutputStream) printStream20, false);
        printStream20.write((int) '#');
        printStream20.print((float) (short) 0);
        printStream20.print(10L);
        printStream20.write(1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions37.setRewriteNewDateGoogNow(true);
        boolean boolean40 = compilerOptions37.extractPrototypeMemberDeclarations;
        compilerOptions37.setCollapseProperties(false);
        compilerOptions37.setClosurePass(true);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        compilerOptions37.setInputPropertyMapSerialized(byteArray50);
        printStream20.write(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            printStream11.write(byteArray50, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup3);
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup5);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[DiagnosticGroup<missingProperties>, DiagnosticGroup<missingProperties>, hi!]");
        org.junit.Assert.assertNotNull(printStream11);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, 4]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 0, 1, 0, -1]");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        double double13 = compiler12.getProgress();
        compiler12.reportCodeChange();
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset16);
        sourceFile17.setOriginalPath("hi!");
        java.lang.String str20 = sourceFile17.getName();
        com.google.javascript.rhino.Node node21 = null; // flaky: compiler12.parse(sourceFile17);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter22 = null; // flaky: compiler12.getReverseAbstractInterpreter();
        boolean boolean23 = locationMappingList9.remove((java.lang.Object) compiler12);
        int int25 = locationMappingList9.indexOf((java.lang.Object) (-1.0d));
        int int26 = locationMappingList9.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        java.lang.String[] strArray36 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        compilerOptions27.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList37);
        boolean boolean40 = locationMappingList9.containsAll((java.util.Collection<java.lang.String>) strList37);
        java.lang.Object[] objArray41 = locationMappingList9.toArray();
        java.lang.Object[] objArray42 = locationMappingList9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor44 = locationMappingList9.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node21);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("Unversioned directory", generator1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = sourceFile2.getLineOfOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel7 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray8 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList9 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList9, locationMappingArray8);
        compilerOptions0.sourceMapLocationMappings = locationMappingList9;
        java.lang.Object[] objArray12 = locationMappingList9.toArray();
        java.util.ListIterator<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingItor14 = locationMappingList9.listIterator(0);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        double double16 = compiler15.getProgress();
        compiler15.reportCodeChange();
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset19);
        sourceFile20.setOriginalPath("hi!");
        java.lang.String str23 = sourceFile20.getName();
        com.google.javascript.rhino.Node node24 = null; // flaky: compiler15.parse(sourceFile20);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter25 = null; // flaky: compiler15.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker26 = compiler15.tracker;
        boolean boolean27 = locationMappingList9.equals((java.lang.Object) compiler15);
        com.google.javascript.jscomp.JsAst jsAst28 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler15.replaceScript(jsAst28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkLevel7 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel7.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(locationMappingItor14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node24);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter25);
        org.junit.Assert.assertNull(performanceTracker26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        compilerOptions0.setExtractPrototypeMemberDeclarations(false);
        compilerOptions0.setNameReferenceGraphPath("Unversioned directory");
        compilerOptions0.setMarkNoSideEffectCalls(false);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        double double4 = compiler3.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager5 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager6 = null; // flaky: compiler3.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray8 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        boolean boolean12 = compilerOptions9.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach13 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions9.setInlineVariables(reach13);
        compilerOptions9.setPrintInputDelimiter(true);
        boolean boolean17 = compilerOptions9.closurePass;
        compilerOptions9.setOutputCharset("java.io.IOException");
// flaky:         compiler3.init(jSSourceFileArray7, jSSourceFileArray8, compilerOptions9);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        double double22 = compiler21.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager23 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager24 = null; // flaky: compiler21.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        boolean boolean30 = compilerOptions27.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach31 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions27.setInlineVariables(reach31);
        compilerOptions27.setPrintInputDelimiter(true);
        boolean boolean35 = compilerOptions27.closurePass;
        compilerOptions27.setOutputCharset("java.io.IOException");
// flaky:         compiler21.init(jSSourceFileArray25, jSSourceFileArray26, compilerOptions27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions39.setInlineConstantVars(true);
// flaky:         compiler1.init(jSSourceFileArray7, jSSourceFileArray25, compilerOptions39);
        boolean boolean43 = compilerOptions39.aliasKeywords;
        compilerOptions39.ambiguateProperties = true;
        org.junit.Assert.assertNotNull(intermediateState2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager5);
// flaky:         org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertNotNull(jSSourceFileArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + reach13 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach13.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager23);
// flaky:         org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + reach31 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach31.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("", throwable1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: " + "'", str5, "java.io.IOException: ");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        int int11 = 0; // flaky: compiler0.getWarningCount();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter12 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter12);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        java.util.Set<java.lang.String> strSet1 = compilerOptions0.stripNamePrefixes;
        byte[] byteArray2 = compilerOptions0.inputVariableMapSerialized;
        compilerOptions0.checkSymbols = false;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler5 = compilerOptions0.getAliasTransformationHandler();
        com.google.javascript.jscomp.PropertyRenamingPolicy propertyRenamingPolicy6 = compilerOptions0.propertyRenaming;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        double double8 = compiler7.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager9 = null; // flaky: compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler10 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager9);
        compilerOptions0.setErrorHandler((com.google.javascript.jscomp.ErrorHandler) errorManager9);
        com.google.javascript.jscomp.Compiler compiler12 = null; // flaky: new com.google.javascript.jscomp.Compiler(errorManager9);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(aliasTransformationHandler5);
        org.junit.Assert.assertTrue("'" + propertyRenamingPolicy6 + "' != '" + com.google.javascript.jscomp.PropertyRenamingPolicy.OFF + "'", propertyRenamingPolicy6.equals(com.google.javascript.jscomp.PropertyRenamingPolicy.OFF));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        com.google.javascript.rhino.Node node6 = null; // flaky: compiler2.parse(sourceFile4);
        double double7 = compiler2.getProgress();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        double double9 = compiler8.getProgress();
        compiler8.reportCodeChange();
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        compiler8.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        compiler2.setState(intermediateState13);
        compiler0.setState(intermediateState13);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker16 = compiler0.tracker;
        com.google.javascript.rhino.InputId inputId17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput18 = compiler0.getInput(inputId17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(intermediateState13);
        org.junit.Assert.assertNull(performanceTracker16);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setPropertyAffinity(true);
        boolean boolean7 = compilerOptions0.closurePass;
        compilerOptions0.setCheckCaja(true);
        java.lang.String str10 = compilerOptions0.syntheticBlockEndMarker;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        java.lang.String str4 = sourceFile1.getLine(0);
        sourceFile1.setOriginalPath("");
        boolean boolean7 = sourceFile1.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader8 = sourceFile1.getCodeReader();
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.enableExternExports(true);
        java.util.Set<java.lang.String> strSet3 = compilerOptions0.stripTypes;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap4 = null;
        compilerOptions0.customPasses = customPassExecutionTimeMultimap4;
        java.lang.String str6 = compilerOptions0.aliasStringsBlacklist;
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        boolean boolean10 = false; // flaky: compiler0.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        double double14 = compiler13.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager15 = null; // flaky: compiler13.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager16 = null; // flaky: compiler13.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        boolean boolean22 = compilerOptions19.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach23 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions19.setInlineVariables(reach23);
        compilerOptions19.setPrintInputDelimiter(true);
        boolean boolean27 = compilerOptions19.closurePass;
        compilerOptions19.setOutputCharset("java.io.IOException");
// flaky:         compiler13.init(jSSourceFileArray17, jSSourceFileArray18, compilerOptions19);
// flaky:         compiler0.init(jSSourceFileArray11, jSModuleArray12, compilerOptions19);
        com.google.javascript.jscomp.SourceMap sourceMap32 = compiler0.getSourceMap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager15);
// flaky:         org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + reach23 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach23.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sourceMap32);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        boolean boolean8 = compilerOptions0.optimizeReturns;
        compilerOptions0.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions12.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compilerOptions12.setCodingConvention(codingConvention15);
        compilerOptions12.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel19 = compilerOptions12.checkProvides;
        java.lang.String[] strArray21 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        compilerOptions12.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList22);
        java.util.stream.Stream<java.lang.String> strStream25 = strList22.stream();
        compilerOptions0.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList22);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions27.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention30 = null;
        compilerOptions27.setCodingConvention(codingConvention30);
        compilerOptions27.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel34 = compilerOptions27.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray35 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList36 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList36, locationMappingArray35);
        compilerOptions27.sourceMapLocationMappings = locationMappingList36;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        double double40 = compiler39.getProgress();
        compiler39.reportCodeChange();
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.SourceFile sourceFile44 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset43);
        sourceFile44.setOriginalPath("hi!");
        java.lang.String str47 = sourceFile44.getName();
        com.google.javascript.rhino.Node node48 = null; // flaky: compiler39.parse(sourceFile44);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter49 = null; // flaky: compiler39.getReverseAbstractInterpreter();
        boolean boolean50 = locationMappingList36.remove((java.lang.Object) compiler39);
        int int52 = locationMappingList36.indexOf((java.lang.Object) (-1.0d));
        int int53 = locationMappingList36.size();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions54.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention57 = null;
        compilerOptions54.setCodingConvention(codingConvention57);
        compilerOptions54.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel61 = compilerOptions54.checkProvides;
        java.lang.String[] strArray63 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        compilerOptions54.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList64);
        boolean boolean67 = locationMappingList36.containsAll((java.util.Collection<java.lang.String>) strList64);
        compilerOptions0.setManageClosureDependencies((java.util.List<java.lang.String>) strList64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + checkLevel19 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel19.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strStream25);
        org.junit.Assert.assertTrue("'" + checkLevel34 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel34.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node48);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + checkLevel61 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel61.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        compilerOptions0.setGeneratePseudoNames(true);
        compilerOptions0.inlineLocalFunctions = false;
        compilerOptions0.setIdeMode(true);
        compilerOptions0.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet13 = compilerOptions0.aliasableStrings;
        com.google.common.collect.Multimap<com.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass> customPassExecutionTimeMultimap14 = compilerOptions0.customPasses;
        compilerOptions0.setLabelRenaming(false);
        com.google.javascript.jscomp.CheckLevel checkLevel17 = compilerOptions0.checkProvides;
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions19.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention22 = null;
        compilerOptions19.setCodingConvention(codingConvention22);
        compilerOptions19.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel26 = compilerOptions19.checkProvides;
        com.google.javascript.jscomp.SourceMap.LocationMapping[] locationMappingArray27 = new com.google.javascript.jscomp.SourceMap.LocationMapping[] {};
        java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList28 = new java.util.ArrayList<com.google.javascript.jscomp.SourceMap.LocationMapping>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.SourceMap.LocationMapping>) locationMappingList28, locationMappingArray27);
        compilerOptions19.sourceMapLocationMappings = locationMappingList28;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        double double32 = compiler31.getProgress();
        compiler31.reportCodeChange();
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.SourceFile sourceFile36 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset35);
        sourceFile36.setOriginalPath("hi!");
        java.lang.String str39 = sourceFile36.getName();
        com.google.javascript.rhino.Node node40 = null; // flaky: compiler31.parse(sourceFile36);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter41 = null; // flaky: compiler31.getReverseAbstractInterpreter();
        boolean boolean42 = locationMappingList28.remove((java.lang.Object) compiler31);
        int int44 = locationMappingList28.indexOf((java.lang.Object) (-1.0d));
        java.lang.String[] strArray47 = new java.lang.String[] { "2019/07/12 07:12", "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = locationMappingList28.containsAll((java.util.Collection<java.lang.String>) strList48);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions51.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention54 = null;
        compilerOptions51.setCodingConvention(codingConvention54);
        boolean boolean56 = compilerOptions51.generateExports;
        compilerOptions51.gatherCssNames = false;
        boolean boolean59 = compilerOptions51.optimizeReturns;
        compilerOptions51.smartNameRemoval = true;
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions63.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention66 = null;
        compilerOptions63.setCodingConvention(codingConvention66);
        compilerOptions63.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel70 = compilerOptions63.checkProvides;
        java.lang.String[] strArray72 = new java.lang.String[] { "java.io.IOException: Unversioned directory" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        compilerOptions63.setReplaceStringsFunctionDescriptions((java.util.List<java.lang.String>) strList73);
        java.util.stream.Stream<java.lang.String> strStream76 = strList73.stream();
        compilerOptions51.setReplaceStringsConfiguration("hi!", (java.util.List<java.lang.String>) strList73);
        boolean boolean78 = locationMappingList28.removeAll((java.util.Collection<java.lang.String>) strList73);
        compilerOptions0.setReplaceStringsConfiguration("java.io.IOException: ", (java.util.List<java.lang.String>) strList73);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(customPassExecutionTimeMultimap14);
        org.junit.Assert.assertTrue("'" + checkLevel17 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel17.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel26 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel26.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node40);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + checkLevel70 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel70.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strStream76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        com.google.javascript.jscomp.SourceFile.Builder builder0 = new com.google.javascript.jscomp.SourceFile.Builder();
        com.google.javascript.jscomp.SourceFile.Generator generator2 = null;
        com.google.javascript.jscomp.SourceFile sourceFile3 = builder0.buildFromGenerator("hi!", generator2);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile5 = builder0.buildFromFile(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.generateExports;
        compilerOptions0.gatherCssNames = false;
        compilerOptions0.disableRuntimeTypeCheck();
        compilerOptions0.setOptimizeCalls(false);
        compilerOptions0.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState2 = compiler1.getState();
        // The following exception was thrown during execution in test generation
        try {
            compiler1.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState2);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = null;
        compilerOptions0.setCodingConvention(codingConvention3);
        boolean boolean5 = compilerOptions0.computeFunctionSideEffects;
        boolean boolean6 = compilerOptions0.printInputDelimiter;
        compilerOptions0.syntheticBlockEndMarker = "java.io.IOException";
        compilerOptions0.enableRuntimeTypeCheck("java.io.IOException: ");
        compilerOptions0.setRemoveUnusedPrototypePropertiesInExterns(true);
        compilerOptions0.inlineConstantVars = true;
        compilerOptions0.exportTestFunctions = true;
        boolean boolean17 = compilerOptions0.crossModuleCodeMotion;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        compilerOptions0.setCheckSuspiciousCode(true);
        compilerOptions0.setConvertToDottedProperties(false);
        compilerOptions0.setFoldConstants(false);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions9.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compilerOptions9.setCodingConvention(codingConvention12);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode14 = compilerOptions9.getTracerMode();
        com.google.javascript.jscomp.DiagnosticGroup diagnosticGroup15 = com.google.javascript.jscomp.DiagnosticGroups.UNDEFINED_NAMES;
        com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED = diagnosticGroup15;
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions17.setRewriteNewDateGoogNow(true);
        boolean boolean20 = compilerOptions17.extractPrototypeMemberDeclarations;
        compilerOptions17.convertToDottedProperties = true;
        com.google.javascript.jscomp.CheckLevel checkLevel23 = compilerOptions17.brokenClosureRequiresLevel;
        compilerOptions9.setWarningLevel(diagnosticGroup15, checkLevel23);
        com.google.javascript.jscomp.CheckLevel checkLevel25 = compilerOptions9.checkGlobalThisLevel;
        compilerOptions0.setCheckProvides(checkLevel25);
        java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> locationMappingList27 = compilerOptions0.sourceMapLocationMappings;
        java.io.IOException[] iOExceptionArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException[] iOExceptionArray29 = locationMappingList27.toArray(iOExceptionArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tracerMode14 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode14.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
// flaky:         org.junit.Assert.assertNotNull(diagnosticGroup15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + checkLevel23 + "' != '" + com.google.javascript.jscomp.CheckLevel.ERROR + "'", checkLevel23.equals(com.google.javascript.jscomp.CheckLevel.ERROR));
        org.junit.Assert.assertTrue("'" + checkLevel25 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel25.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertNotNull(locationMappingList27);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        com.google.javascript.jscomp.CompilerOptions compilerOptions0 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions0.setRewriteNewDateGoogNow(true);
        boolean boolean3 = compilerOptions0.extractPrototypeMemberDeclarations;
        compilerOptions0.convertToDottedProperties = true;
        boolean boolean6 = compilerOptions0.inlineConstantVars;
        boolean boolean7 = compilerOptions0.extractPrototypeMemberDeclarations;
        boolean boolean8 = compilerOptions0.gatherCssNames;
        boolean boolean9 = compilerOptions0.markAsCompiled;
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions10.setRewriteNewDateGoogNow(true);
        boolean boolean13 = compilerOptions10.extractPrototypeMemberDeclarations;
        compilerOptions10.setCollapseProperties(false);
        java.util.Set<java.lang.String> strSet16 = compilerOptions10.stripTypePrefixes;
        com.google.javascript.jscomp.CheckLevel checkLevel17 = null;
        compilerOptions10.setCheckGlobalThisLevel(checkLevel17);
        com.google.javascript.jscomp.CompilerOptions.TracerMode tracerMode19 = compilerOptions10.getTracerMode();
        compilerOptions0.setTracer(tracerMode19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions21.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = null;
        compilerOptions21.setCodingConvention(codingConvention24);
        compilerOptions21.setGenerateExports(true);
        com.google.javascript.jscomp.CheckLevel checkLevel28 = compilerOptions21.checkProvides;
        boolean boolean29 = compilerOptions21.smartNameRemoval;
        java.util.Set<java.lang.String> strSet30 = compilerOptions21.aliasableStrings;
        compilerOptions0.stripNamePrefixes = strSet30;
        boolean boolean32 = compilerOptions0.removeUnusedLocalVars;
        compilerOptions0.removeUnusedVars = true;
        compilerOptions0.computeFunctionSideEffects = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + tracerMode19 + "' != '" + com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF + "'", tracerMode19.equals(com.google.javascript.jscomp.CompilerOptions.TracerMode.OFF));
        org.junit.Assert.assertTrue("'" + checkLevel28 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel28.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = null; // flaky: compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile13 = null;
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        double double15 = compiler14.getProgress();
        compiler14.reportCodeChange();
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.SourceFile sourceFile19 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset18);
        sourceFile19.setOriginalPath("hi!");
        java.lang.String str22 = sourceFile19.getName();
        com.google.javascript.rhino.Node node23 = null; // flaky: compiler14.parse(sourceFile19);
        boolean boolean24 = false; // flaky: compiler14.hasErrors();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray26 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        double double28 = compiler27.getProgress();
        com.google.javascript.jscomp.ErrorManager errorManager29 = null; // flaky: compiler27.getErrorManager();
        com.google.javascript.jscomp.ErrorManager errorManager30 = null; // flaky: compiler27.getErrorManager();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray31 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions33.setRewriteNewDateGoogNow(true);
        boolean boolean36 = compilerOptions33.extractPrototypeMemberDeclarations;
        com.google.javascript.jscomp.CompilerOptions.Reach reach37 = com.google.javascript.jscomp.CompilerOptions.Reach.ALL;
        compilerOptions33.setInlineVariables(reach37);
        compilerOptions33.setPrintInputDelimiter(true);
        boolean boolean41 = compilerOptions33.closurePass;
        compilerOptions33.setOutputCharset("java.io.IOException");
// flaky:         compiler27.init(jSSourceFileArray31, jSSourceFileArray32, compilerOptions33);
// flaky:         compiler14.init(jSSourceFileArray25, jSModuleArray26, compilerOptions33);
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = new com.google.javascript.jscomp.CompilerOptions();
        compilerOptions46.setRewriteNewDateGoogNow(true);
        com.google.javascript.jscomp.CodingConvention codingConvention49 = null;
        compilerOptions46.setCodingConvention(codingConvention49);
        boolean boolean51 = compilerOptions46.generateExports;
        compilerOptions46.gatherCssNames = false;
        boolean boolean54 = compilerOptions46.optimizeReturns;
        compilerOptions46.smartNameRemoval = true;
        java.util.Set<java.lang.String> strSet57 = compilerOptions46.aliasableStrings;
        compilerOptions46.generateExports = false;
        boolean boolean60 = compilerOptions46.assumeStrictThis();
        com.google.javascript.jscomp.CheckLevel checkLevel61 = compilerOptions46.checkGlobalThisLevel;
        compilerOptions46.setAppNameStr("java.io.IOException");
        boolean boolean64 = compilerOptions46.assumeStrictThis();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result65 = compiler0.compile(jSSourceFile13, jSModuleArray26, compilerOptions46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(reverseAbstractInterpreter10);
        org.junit.Assert.assertNull(performanceTracker11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertNotNull(jSModuleArray26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(errorManager29);
// flaky:         org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertNotNull(jSSourceFileArray31);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + reach37 + "' != '" + com.google.javascript.jscomp.CompilerOptions.Reach.ALL + "'", reach37.equals(com.google.javascript.jscomp.CompilerOptions.Reach.ALL));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + checkLevel61 + "' != '" + com.google.javascript.jscomp.CheckLevel.OFF + "'", checkLevel61.equals(com.google.javascript.jscomp.CheckLevel.OFF));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        double double1 = compiler0.getProgress();
        compiler0.reportCodeChange();
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset4);
        sourceFile5.setOriginalPath("hi!");
        java.lang.String str8 = sourceFile5.getName();
        com.google.javascript.rhino.Node node9 = null; // flaky: compiler0.parse(sourceFile5);
        com.google.javascript.jscomp.ErrorManager errorManager10 = null; // flaky: compiler0.getErrorManager();
        int int11 = 0; // flaky: compiler0.getWarningCount();
        java.lang.String str12 = compiler0.getAstDotGraph();
        boolean boolean13 = false; // flaky: compiler0.acceptEcmaScript5();
        boolean boolean14 = false; // flaky: compiler0.acceptConstKeyword();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node9);
// flaky:         org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.rhino.Node node4 = null; // flaky: compiler0.parse(sourceFile2);
        boolean boolean5 = false; // flaky: compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModule jSModule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = compiler0.toSource(jSModule6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.io.PrintStream printStream1 = new java.io.PrintStream("Unversioned directory");
        char[] charArray4 = new char[] { '4', '4' };
        printStream1.print(charArray4);
        printStream1.print((int) ' ');
        java.io.PrintStream printStream9 = new java.io.PrintStream((java.io.OutputStream) printStream1, false);
        printStream1.write((int) '#');
        printStream1.print((float) (short) 0);
        printStream1.print(10L);
        printStream1.print("java.io.IOException: ");
        printStream1.println((int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, 4]");
    }
}
