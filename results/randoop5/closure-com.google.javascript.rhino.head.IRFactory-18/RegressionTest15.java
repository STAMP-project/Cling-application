import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter17);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory20.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node25 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.Node node26 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.Node node27 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory14.transformTree(astRoot24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node29 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(astRoot24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(scriptNode28);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
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
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass27 = iRFactory0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
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
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory23.parse("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node40 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
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
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(astRoot39);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = iRFactory34.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.Node node55 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot54);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = iRFactory0.transformTree(astRoot54);
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
        org.junit.Assert.assertNotNull(astRoot46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(astRoot54);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
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
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = iRFactory25.transformTree(astRoot30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory25.parse("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory0.transformTree(astRoot35);
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
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(scriptNode31);
        org.junit.Assert.assertNotNull(astRoot35);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
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
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory0.parse(reader16, "", 0);
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
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (short) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass14 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
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
        boolean boolean24 = iRFactory0.eof();
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse(reader25, "", (int) (byte) 10);
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
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = iRFactory4.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot8);
        com.google.javascript.rhino.head.Node node10 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot8);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node23 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory12.transformTree(astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory12.parse("", "hi!", 10);
        com.google.javascript.rhino.head.Node node29 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory2.transformTree(astRoot28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
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
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse(reader18, "", 0);
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
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
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
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node32 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory16.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory0.transformTree(astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(astRoot36);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
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
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "hi!", (int) 'a');
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
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
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
        boolean boolean34 = iRFactory0.eof();
        boolean boolean35 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory0.parse("", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node27 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory16.transformTree(astRoot25);
        com.google.javascript.rhino.head.Node node29 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory15.parse("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(scriptNode28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse(reader22, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory0.parse(reader12, "hi!", (int) (byte) 1);
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
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
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
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "", (int) 'a');
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
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node32 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node33 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory10.transformTree(astRoot28);
        com.google.javascript.rhino.head.Node node35 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory9.parse("", "", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node40 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(scriptNode34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(astRoot39);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
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
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass23 = iRFactory0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("hi!", "", 10);
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
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse(reader7, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("hi!", "", 100);
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
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
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
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass22 = iRFactory0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
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
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse(reader20, "", 0);
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
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
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
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory28.transformTree(astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory28.parse("", "", 10);
        com.google.javascript.rhino.head.Node node39 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory0.transformTree(astRoot38);
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
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(scriptNode34);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons15, errorReporter16);
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory19.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node24 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.Node node25 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.Node node26 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory11.transformTree(astRoot23);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory11.parse("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory0.transformTree(astRoot31);
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
        org.junit.Assert.assertNotNull(astRoot23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(scriptNode27);
        org.junit.Assert.assertNotNull(astRoot31);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse("hi!", "", (int) '4');
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
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
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
        boolean boolean21 = iRFactory0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse(reader22, "hi!", (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse(reader8, "hi!", (-1));
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
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory26.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory25.transformTree(astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = iRFactory25.parse("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = iRFactory0.transformTree(astRoot47);
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
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(astRoot47);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse(reader8, "hi!", (int) (byte) 0);
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
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node31 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node32 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory0.transformTree(astRoot30);
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
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "", (int) '#');
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory34.transformTree(astRoot43);
        com.google.javascript.rhino.head.Node node47 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.ast.AstRoot astRoot51 = iRFactory33.parse("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = iRFactory0.transformTree(astRoot51);
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
        org.junit.Assert.assertNotNull(scriptNode46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(astRoot51);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", 10);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory0.parse(reader11, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
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
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse("", "", 100);
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
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
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
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "hi!", (int) ' ');
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
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
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
        com.google.javascript.rhino.head.Node node14 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "", 0);
        java.lang.Class<?> wildcardClass19 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
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
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory0.parse(reader31, "", (int) (short) -1);
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
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot7 = iRFactory3.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node8 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory2.parse("", "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "", (int) '#');
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory36.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node42 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory31.transformTree(astRoot40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = iRFactory31.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node48 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot47);
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
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(astRoot47);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node23 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
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
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("", "", (int) (byte) 10);
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
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
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
        java.io.Reader reader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory0.parse(reader32, "", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
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
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse("hi!", "hi!", (int) (byte) 1);
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
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
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
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory3.transformTree(astRoot15);
        com.google.javascript.rhino.head.Node node20 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory2.parse("", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (short) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node30 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node31 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory20.transformTree(astRoot29);
        com.google.javascript.rhino.head.Node node33 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode32);
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
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
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
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "", (int) '4');
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
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse("hi!", "hi!", 1);
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
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
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
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory10.parse("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node27 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
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
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
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
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory0.parse(reader16, "", 100);
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
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse("", "hi!", 1);
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
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
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
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory19.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory18.transformTree(astRoot35);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node37 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
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
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(scriptNode36);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse("hi!", "hi!", (int) 'a');
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
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node23 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory12.transformTree(astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory12.parse("", "hi!", 10);
        com.google.javascript.rhino.head.Node node29 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory11.parse("", "", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot33);
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
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse(reader13, "", 0);
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
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "hi!", 100);
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
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse("", "hi!", (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = iRFactory4.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot8);
        com.google.javascript.rhino.head.Node node10 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot8);
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
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory11.parse("", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory2.transformTree(astRoot27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertNotNull(astRoot27);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
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
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory20.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory19.transformTree(astRoot24);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory19.parse("", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
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
        org.junit.Assert.assertNotNull(astRoot24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(astRoot29);
    }
}

