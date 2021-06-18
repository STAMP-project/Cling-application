import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory21.transformTree(astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory21.parse("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node32 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
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
        org.junit.Assert.assertNotNull(astRoot26);
        org.junit.Assert.assertNotNull(scriptNode27);
        org.junit.Assert.assertNotNull(astRoot31);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory23.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory22.transformTree(astRoot39);
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = iRFactory22.parse("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory0.transformTree(astRoot44);
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
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(scriptNode40);
        org.junit.Assert.assertNotNull(astRoot44);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse("", "", (int) (short) 100);
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
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", (int) (byte) 1);
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
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node27 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node28 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory16.parse("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory0.transformTree(astRoot32);
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
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(astRoot32);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
        java.lang.Class<?> wildcardClass16 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node30 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node31 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node32 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory20.parse("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node37 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
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
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(astRoot36);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node17 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node18 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node19 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node20 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory30.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node35 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node36 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node37 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node38 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node44 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(astRoot34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse(reader21, "", (int) (short) -1);
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
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", (int) (short) 0);
        java.io.Reader reader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory0.parse(reader29, "hi!", (int) (short) 1);
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
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse("hi!", "hi!", 10);
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
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        java.lang.Class<?> wildcardClass24 = iRFactory0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "", (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse(reader20, "", 1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

