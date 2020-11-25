import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = parser0.parse(reader13, "", (int) (byte) -1);
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
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot8 = parser0.parse("", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) (byte) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = parser0.parse(reader8, "", 100);
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
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = parser0.parse("hi!", "", 0);
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
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot13 = parser0.parse(reader10, "", (int) (byte) 0);
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
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot12 = parser0.parse("hi!", "hi!", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        boolean boolean22 = parser0.eof();
        boolean boolean23 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = parser0.parse("", "", (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 100);
        boolean boolean5 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot9 = parser0.parse("hi!", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = parser0.parse(reader21, "hi!", (int) ' ');
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
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = parser0.parse(reader7, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = parser0.parse("", "hi!", (int) (byte) 1);
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
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (short) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        java.lang.Class<?> wildcardClass20 = parser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (short) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = parser0.parse(reader22, "hi!", (int) (byte) 10);
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
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) (short) 1);
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot8 = parser0.parse(reader5, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) (byte) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = parser0.parse(reader16, "hi!", (int) (byte) 10);
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
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        boolean boolean22 = parser0.eof();
        boolean boolean23 = parser0.eof();
        boolean boolean24 = parser0.eof();
        boolean boolean25 = parser0.eof();
        boolean boolean26 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = parser0.parse("", "hi!", (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot15 = parser0.parse("hi!", "hi!", (int) (byte) 1);
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
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = parser0.parse("", "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        java.lang.Class<?> wildcardClass20 = parser0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = parser0.parse(reader7, "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        boolean boolean22 = parser0.eof();
        boolean boolean23 = parser0.eof();
        boolean boolean24 = parser0.eof();
        boolean boolean25 = parser0.eof();
        boolean boolean26 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = parser0.parse("hi!", "hi!", 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", 0);
        boolean boolean5 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot9 = parser0.parse("", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = parser0.parse("hi!", "hi!", (int) (byte) -1);
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
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) (short) 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = parser0.parse("hi!", "", (int) '#');
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
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = parser0.parse("", "hi!", 1);
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
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot12 = parser0.parse("hi!", "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = parser0.parse(reader15, "hi!", (int) ' ');
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
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = parser0.parse(reader21, "hi!", (int) (byte) 0);
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
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = parser0.parse("hi!", "hi!", (int) (byte) 0);
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
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        boolean boolean22 = parser0.eof();
        boolean boolean23 = parser0.eof();
        boolean boolean24 = parser0.eof();
        boolean boolean25 = parser0.eof();
        boolean boolean26 = parser0.eof();
        java.lang.Class<?> wildcardClass27 = parser0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = parser0.parse("", "", 10);
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
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        java.lang.Class<?> wildcardClass12 = parser0.getClass();
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = parser0.parse(reader18, "hi!", (int) ' ');
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
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (short) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot13 = parser0.parse(reader10, "", (int) '4');
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
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = parser0.parse("hi!", "hi!", 0);
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
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) (byte) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
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
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = parser0.parse("", "", (-1));
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
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot13 = parser0.parse(reader10, "hi!", (int) (byte) 100);
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
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 10);
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot8 = parser0.parse(reader5, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot12 = parser0.parse(reader9, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = parser0.parse("hi!", "", 0);
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
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (byte) 10);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        boolean boolean18 = parser0.eof();
        boolean boolean19 = parser0.eof();
        boolean boolean20 = parser0.eof();
        boolean boolean21 = parser0.eof();
        boolean boolean22 = parser0.eof();
        boolean boolean23 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = parser0.parse("", "hi!", (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "hi!", (int) (short) 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = parser0.parse(reader7, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", 100);
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot15 = parser0.parse("", "", (int) '#');
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
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.google.javascript.rhino.head.Parser parser0 = new com.google.javascript.rhino.head.Parser();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = parser0.parse("", "", (int) ' ');
        boolean boolean5 = parser0.eof();
        boolean boolean6 = parser0.eof();
        boolean boolean7 = parser0.eof();
        boolean boolean8 = parser0.eof();
        boolean boolean9 = parser0.eof();
        boolean boolean10 = parser0.eof();
        boolean boolean11 = parser0.eof();
        boolean boolean12 = parser0.eof();
        boolean boolean13 = parser0.eof();
        boolean boolean14 = parser0.eof();
        boolean boolean15 = parser0.eof();
        boolean boolean16 = parser0.eof();
        boolean boolean17 = parser0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = parser0.parse("", "", (int) (byte) 1);
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
    }
}

