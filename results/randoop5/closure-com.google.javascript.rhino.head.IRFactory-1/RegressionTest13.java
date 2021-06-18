import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node17 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node18 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory5.transformTree(astRoot15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory0.transformTree(astRoot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(scriptNode19);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
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
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory23.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory23.parse("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory0.transformTree(astRoot43);
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
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(scriptNode39);
        org.junit.Assert.assertNotNull(astRoot43);
    }
}

