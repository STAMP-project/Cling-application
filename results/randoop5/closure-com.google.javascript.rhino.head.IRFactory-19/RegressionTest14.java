import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory0.parse(reader11, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("", "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory23.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node28 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.Node node29 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory18.transformTree(astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory18.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = iRFactory0.transformTree(astRoot34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNotNull(astRoot34);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory0.transformTree(astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot32);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory0.parse(reader11, "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse("hi!", "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = iRFactory30.transformTree(astRoot39);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory30.parse("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = iRFactory0.transformTree(astRoot46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(scriptNode42);
        org.junit.Assert.assertNotNull(astRoot46);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter39);
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory42 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory42.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node47 = iRFactory41.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node48 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node49 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node50 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node51 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = iRFactory28.transformTree(astRoot46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = iRFactory0.transformTree(astRoot46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(scriptNode52);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory0.parse(reader28, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("hi!", "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory24.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory0.transformTree(astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = iRFactory11.transformTree(astRoot20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory11.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory0.transformTree(astRoot27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertNotNull(astRoot27);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass20 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory0.transformTree(astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass29 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory39.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node44 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node45 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node46 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node47 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node48 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = iRFactory25.transformTree(astRoot43);
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = iRFactory25.parse("", "hi!", (int) (short) 100);
        com.google.javascript.rhino.head.Node node54 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = iRFactory0.transformTree(astRoot53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(scriptNode49);
        org.junit.Assert.assertNotNull(astRoot53);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory23.transformTree(astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory23.parse("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", 1);
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory39.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node44 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node45 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node46 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node47 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons15, errorReporter16);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node36 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node37 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = iRFactory14.transformTree(astRoot32);
        com.google.javascript.rhino.head.Node node39 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory13.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node44 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(scriptNode38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(astRoot43);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory23.transformTree(astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory23.parse("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse(reader15, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = iRFactory19.transformTree(astRoot28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node32 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(scriptNode31);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node24 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node25 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node26 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory10.parse("", "hi!", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node31 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter34);
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = iRFactory37.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node42 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.Node node43 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.Node node44 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.Node node45 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node50 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = iRFactory0.transformTree(astRoot49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(astRoot49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory36.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node42 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node43 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node44 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot48 = iRFactory28.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = iRFactory0.transformTree(astRoot48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(astRoot48);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory26.transformTree(astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory26.parse("", "", 10);
        com.google.javascript.rhino.head.Node node37 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = iRFactory0.transformTree(astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory0.transformTree(astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse(reader13, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory24.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node41 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory1.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", 10);
        com.google.javascript.rhino.head.Node node18 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot17);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory19.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(astRoot23);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory0.parse("", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse(reader27, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.ast.AstNode astNode26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node27 = iRFactory0.transform(astNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory0.parse("", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory19.parse("", "", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot23);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory0.parse("hi!", "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory34.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node40 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node41 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node42 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node43 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory20.transformTree(astRoot38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot48 = iRFactory20.parse("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = iRFactory0.transformTree(astRoot48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(scriptNode44);
        org.junit.Assert.assertNotNull(astRoot48);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) '4');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass11 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", 65536);
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory24.parse("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse(reader27, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory1.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", 10);
        com.google.javascript.rhino.head.Node node18 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter39);
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory42 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory42.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node47 = iRFactory41.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node48 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node49 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node50 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node51 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = iRFactory28.transformTree(astRoot46);
        com.google.javascript.rhino.head.ast.AstRoot astRoot56 = iRFactory28.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = iRFactory0.transformTree(astRoot56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(scriptNode52);
        org.junit.Assert.assertNotNull(astRoot56);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse("hi!", "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse(reader17, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse("", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse(reader17, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", 65536);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) '4');
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory39.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node44 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node45 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node46 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node47 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node48 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = iRFactory25.transformTree(astRoot43);
        com.google.javascript.rhino.head.Node node50 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = iRFactory0.transformTree(astRoot43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(scriptNode49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass28 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node32 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory26.parse("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory0.transformTree(astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(astRoot36);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node32 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node33 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node34 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node35 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse(reader27, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        java.io.Reader reader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse(reader27, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse(reader26, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse("hi!", "", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse(reader26, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("hi!", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: missing ; before statement (#100)");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = iRFactory0.transformTree(astRoot22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse("hi!", "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) '4');
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = iRFactory26.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory26.parse("", "hi!", 10);
        com.google.javascript.rhino.head.Node node43 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory0.transformTree(astRoot42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(scriptNode38);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node36 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory20.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.Node node41 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = iRFactory0.transformTree(astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) '4');
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot8 = iRFactory0.parse(reader5, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node42 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node43 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node44 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory21.transformTree(astRoot39);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory21.parse("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = iRFactory0.transformTree(astRoot49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(scriptNode45);
        org.junit.Assert.assertNotNull(astRoot49);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse(reader19, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory27.transformTree(astRoot32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(scriptNode33);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter10);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node23 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node24 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory8.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node29 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(astRoot28);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory9.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = iRFactory8.transformTree(astRoot25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory8.parse("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node31 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(scriptNode26);
        org.junit.Assert.assertNotNull(astRoot30);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory34.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node40 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node41 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node42 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node43 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory0.transformTree(astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node27 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node28 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory17.transformTree(astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory17.parse("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory39.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node44 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node45 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node46 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory34.parse("", "", (int) (byte) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = iRFactory33.transformTree(astRoot50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node52 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(astRoot50);
        org.junit.Assert.assertNotNull(scriptNode51);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory36.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node42 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node43 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node44 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node45 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory22.transformTree(astRoot40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory22.parse("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = iRFactory0.transformTree(astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(scriptNode46);
        org.junit.Assert.assertNotNull(astRoot50);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean17 = iRFactory0.eof();
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse(reader18, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory1.transformTree(astRoot10);
        com.google.javascript.rhino.head.Node node14 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: missing ; before statement");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons3, errorReporter4);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons6, errorReporter7);
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory10.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node15 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot14);
        com.google.javascript.rhino.head.Node node16 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot14);
        com.google.javascript.rhino.head.Node node17 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot14);
        com.google.javascript.rhino.head.Node node18 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot14);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node36 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory20.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node24 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node25 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory13.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory12.transformTree(astRoot29);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory12.parse("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = iRFactory0.transformTree(astRoot34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNotNull(astRoot34);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory20.parse("", "hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node31 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse("", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node22 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot21);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node30 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node31 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node32 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory17.transformTree(astRoot29);
        com.google.javascript.rhino.head.Node node34 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = iRFactory0.transformTree(astRoot29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(scriptNode33);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory30.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory30.parse("", "", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node32 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node33 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node34 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory22.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.Node node39 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory0.transformTree(astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory34.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node40 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node41 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node42 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory26.parse("", "hi!", 65536);
        com.google.javascript.rhino.head.Node node47 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node48 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(astRoot46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory23.parse("", "", (int) (byte) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory22.transformTree(astRoot39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(scriptNode40);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory10.parse("", "hi!", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node15 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot14);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse("hi!", "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons15, errorReporter16);
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory19.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node24 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.Node node25 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.Node node26 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory14.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = iRFactory13.transformTree(astRoot30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory13.parse("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory0.transformTree(astRoot35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(astRoot23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(scriptNode31);
        org.junit.Assert.assertNotNull(astRoot35);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter39);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons41 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory43 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons41, errorReporter42);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons44, errorReporter45);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory49 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons47, errorReporter48);
        com.google.javascript.rhino.head.IRFactory iRFactory50 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory51 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot55 = iRFactory51.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node56 = iRFactory50.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot55);
        com.google.javascript.rhino.head.Node node57 = iRFactory49.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot55);
        com.google.javascript.rhino.head.Node node58 = iRFactory46.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot55);
        com.google.javascript.rhino.head.Node node59 = iRFactory43.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot55);
        com.google.javascript.rhino.head.Node node60 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot55);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode61 = iRFactory37.transformTree(astRoot55);
        com.google.javascript.rhino.head.ast.AstRoot astRoot65 = iRFactory37.parse("", "hi!", (int) (short) 100);
        com.google.javascript.rhino.head.Node node66 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot65);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode67 = iRFactory0.transformTree(astRoot65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(astRoot55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(scriptNode61);
        org.junit.Assert.assertNotNull(astRoot65);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory26.transformTree(astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory26.parse("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory0.transformTree(astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertNotNull(astRoot36);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory0.parse(reader11, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (short) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory38.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node44 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node45 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node46 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node47 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = iRFactory24.transformTree(astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = iRFactory24.parse("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node53 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(scriptNode48);
        org.junit.Assert.assertNotNull(astRoot52);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory0.parse("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse(reader21, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter34);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons36, errorReporter37);
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = iRFactory40.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node45 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node46 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node47 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node48 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = iRFactory32.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.Node node53 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = iRFactory0.transformTree(astRoot52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(astRoot44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(astRoot52);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory17.parse("", "hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory0.transformTree(astRoot27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(astRoot27);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory20.parse("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory0.transformTree(astRoot24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot24);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory28.transformTree(astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory28.parse("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node39 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(scriptNode34);
        org.junit.Assert.assertNotNull(astRoot38);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory0.parse(reader28, "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse("", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory25.transformTree(astRoot35);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node40 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(scriptNode39);
    }
}

