import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0d, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 10, (-1), (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 10, 10]");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) (short) 10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, obj3, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0.0]");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, 1, (byte) -1, 'a', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, -1, 97, 0]");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) wildcardClass4, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), 100.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 100.0, 1.0]");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (short) 100, 'a', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 100, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 100, a, -1]");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 1L, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 100L, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) (-1L), (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1]");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 1L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 10L, 10.0f, 10L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 10, 10.0, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 10, 10.0, 10, 0.0]");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 0]");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 1, 0L, 10.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, 0, 10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, 0, 10.0, 1.0]");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) (short) 10, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', obj3, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, -1]");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '4', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, interpreter4, "hi!", (byte) 0, 10.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, obj3, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) wildcardClass2, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, (-1.0f), 1.0d, 10.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, -1.0, 1.0, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, -1.0, 1.0, 10.0, 100]");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (byte) 10, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', 0.0d, 1, (byte) -1, 0L, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, 0.0, 1, -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, 0.0, 1, -1, 0, 100.0]");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 10.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) -1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 1, (byte) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 97]");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, 100L, 100.0d, (byte) 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, 100, 100.0, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, 100, 100.0, 10, 0.0]");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 10L, 10.0f, ' ', (short) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 10, 10.0,  , 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 10, 10.0,  , 0, -1]");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, 0, (byte) 10, (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 10, 0, 32]");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0f, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, obj4, 10, 1L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) interpreter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, obj3, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) interpreter3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 1, (-1), (short) 1, (byte) 1, 'a', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, -1, 1, 1, 97, 10]");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (byte) 0, (short) 1, 0.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0, 1, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0, 1, 0.0, -1]");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 0, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 35]");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1L), 1L, 10.0f, (short) 100, 0, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 1, 10.0, 100, 0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 1, 10.0, 100, 0, ]");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) -1, (short) -1, 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 0, 10]");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0.0]");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, #]");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, '#', '4', (short) -1, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, #, 4, -1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, #, 4, -1, false]");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) -1, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0]");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 32]");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) -1, 10, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, -1, 0]");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 1, 0, (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 100, 35]");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 1, 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10]");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 'a', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) ' ', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 0.0f, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '4', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 1, 1L, (byte) -1, true, 100.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 1, -1, true, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 1, -1, true, 100.0, 10]");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (byte) -1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (-1L), interpreter5, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (byte) 1, 'a', "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 1, a, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 1, a, ]");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1L, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1L, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 100, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 1]");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 100L, 0.0f, 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 100, 0.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 100, 0.0, 100, 100]");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 0.0d, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, 0L, (short) -1, (-1.0f), (-1L), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, 0, -1, -1.0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, 0, -1, -1.0, -1, 1.0]");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 0L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 10, (short) 0, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, -1, 1]");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) (byte) 10, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (short) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 100, 0]");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (short) 0, 10L, 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0, 10, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0, 10, 0, -1]");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 1, (short) 10, (short) 1, (byte) -1, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, 1, -1, 10, 97]");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 35]");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 10.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, interpreter4, obj5, 1, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) -1, '4', (byte) 100, ' ', (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52, 100, 32, -1, 100]");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) "hi!", (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 1.0f, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (-1.0d), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 10, (byte) 100, (byte) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 10, 100, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 10, 100, -1, 10.0]");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { interpreter3, (byte) 1, (-1L), 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) wildcardClass4, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (byte) 1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1, 100]");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) (byte) 0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 0, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 1.0d, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (-1.0d), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 0, 10, (short) 10, (-1), (short) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 10, -1, 0, 0]");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1, (byte) 100, 'a', (-1.0d), (short) 0, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100, a, -1.0, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100, a, -1.0, 0, true]");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, 1.0]");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter6 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass7 = interpreter6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 10, 0.0f, interpreter6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) interpreter3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter6 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, wildcardClass5, interpreter6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0, (-1.0d), 0, (short) 10, (short) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, -1.0, 0, 10, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, -1.0, 0, 10, 100, 0.0]");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { '4', 'a', (byte) 10, ' ', (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 97, 10, 32, 1, 10]");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) '#', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { interpreter3, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) false, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 0.0d, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 1L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) (-1.0d), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) false, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d, (short) 0, 10, 10L, 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, 0, 10, 10, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0, 0, 10, 10, 10, 100.0]");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 10.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 10.0, 0.0]");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, (short) -1, '4', (short) 0, '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 52, 0, 35, 10]");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 0.0d, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (short) -1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) (byte) 10, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) ' ', (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, a]");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) 10.0d, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100]");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) (byte) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) -1, 10, 10, ' ', 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10, 10, 32, 0, 32]");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 1, (byte) 100, (-1), '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, -1, 52, -1]");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) (short) 100, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 100.0f, 10, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 100.0, 10, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 100.0, 10, ]");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 10, 0, ' ', (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 32, 10, 100]");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, true, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, true, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, true, 0]");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, -1]");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 0.0d, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 10.0d, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 1, 'a', '#', (byte) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 97, 35, 10, 52]");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0f, 10.0d, 100.0f, '4', "", '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, 10.0, 100.0, 4, , #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, 10.0, 100.0, 4, , #]");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (-1), '4', 0, '#', (short) 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 52, 0, 35, 100, 1]");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 10, (short) 10, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 10, 0]");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, (byte) -1, "", 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, , 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, , 1, 10]");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 0.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 0.0, 10.0]");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 1, (byte) 10, ' ', (byte) 1, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, 32, 1, -1, -1]");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 10L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) true, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, 0, 0, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 97, 100]");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100]");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 1, 100, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, -1, 32]");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 1, (byte) 10, 10, (byte) 0, (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, 10, 0, -1, -1]");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 1.0f, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '#', 0, 1, (byte) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0, 1, 1, 10]");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, 10, ' ', '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 32, 52, 0]");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) -1, (short) 100, 1, 0, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100, 1, 0, 100, 52]");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 0]");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, (byte) 1, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 1, 97, 100]");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '#', 0.0d, true, 1.0f, 100.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[#, 0.0, true, 1.0, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[#, 0.0, true, 1.0, 100.0, -1]");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (byte) 100, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 100.0d, 0.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 100.0, 0.0, 0.0]");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (-1), (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 0L, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) '4', (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (-1.0f), (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0f, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { '#', 0, 1, (byte) 0, (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0, 1, 0, -1, 52]");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1]");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', (-1.0d), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, -1.0, 10]");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 100, 10]");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 100, 1, 100, 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 100, 0, 0]");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 100, (byte) 0, 10, (short) 1, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 10, 1, 1, 100]");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '4', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray5 = new java.lang.Object[] { interpreter3, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { ' ', (short) 100, 'a', 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 100, 97, 1, -1]");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject(obj1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 10, 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 10]");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 1L, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) '4', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) interpreter3, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (short) 1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 'a', (short) -1, (byte) -1, (short) 10, 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, -1, 10, 1, 0]");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1, obj4, 100.0d, true, 0L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100]");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (byte) 1, 10L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 1, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 1, 10, 0]");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, (byte) 100, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, true]");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (byte) 10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 100, 100, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 0, 0]");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) -1, (byte) 10, 1L, true, 10L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 10, 1, true, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 10, 1, true, 10, 1.0]");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { ' ', (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 100]");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, obj3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { ' ', '#', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 10]");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10L, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1L, wildcardClass5, obj6, (byte) 1, (-1L), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (-1L), (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 0, '4', 'a', (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 52, 97, 100, 35]");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, ' ', 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0,  , 0]");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 100.0f, (byte) 0, (-1), "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, 0, -1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, 0, -1, hi!]");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (-1.0d), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, -1.0, 1]");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, (-1L), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1, 1]");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), (byte) 1, 100, 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 1, 100, a, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 1, 100, a, 100]");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 1.0]");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 10, (short) 0, (short) -1, (short) 0, (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 0, -1, 0, -1, 1]");
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, obj3, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 1L, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 100L, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) (byte) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, obj3, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (short) 100, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) -1, 'a', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 100]");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, 10]");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) (byte) 10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 10, 1, (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, 32]");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0f, "", "hi!", 1.0f, (short) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0, , hi!, 1.0, 0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0, , hi!, 1.0, 0, 1.0]");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (-1), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1, 10.0]");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 100.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), (short) 1, (short) 0, (short) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 0, 0, -1]");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, (byte) 10, 1.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 10, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 10, 1.0, 10]");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 10, 1, 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 10, 10]");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0d, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, interpreter4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 10.0]");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) (short) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 'a', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1L), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 0, 1]");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, ' ', 0, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, 0, 32, -1]");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) (short) -1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (-1L), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10]");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, (short) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1]");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 100.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, obj3, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 1.0]");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, 0, (byte) 100, (short) -1, ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 100, -1, 32, 97]");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 10, 10]");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 1, 100, (byte) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 1, 100]");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 1.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0f, (short) 0, (byte) 10, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, 0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, 0, 10, 0]");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 100L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { interpreter3, 1.0d, 10, 0.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), 1.0d, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 1, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 32]");
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 100L, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, interpreter4, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (byte) 0, 0.0d, '4', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0, 0.0, 4, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0, 0.0, 4, 100.0]");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 52]");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 100.0d, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, (short) 100, '4', (byte) 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 52, 1, 52]");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (byte) 10, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 1]");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '#', 1, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 1, 1]");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) 100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10L, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 0.0d, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 0.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1.0d, (byte) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1.0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1.0, -1, 1.0]");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 4, 1]");
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) -1, 10, 10, 100, 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10, 10, 100, 97, 100]");
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) ' ', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject(obj1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) '4', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 0, (short) 10, (short) 10, '4', 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 10, 52, 10, -1]");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (-1L), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, (-1.0d), "", 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, -1.0, , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, -1.0, , 1]");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, (byte) 100, 100, 0L, 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100, 100, 0, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100, 100, 0, 0, 0.0]");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject(obj1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) -1, 0, 100, (byte) 100, 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0, 100, 100, 100, 10]");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 0, (byte) 10, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 10, 10]");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 10, '4', (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (byte) 10, 100L, 100L, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 10, 100, 100, 4, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 10, 100, 100, 4, #]");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { ' ', (byte) 100, wildcardClass6, "", (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[ , 100, class com.google.javascript.rhino.head.Interpreter, , 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[ , 100, class com.google.javascript.rhino.head.Interpreter, , 100, 1]");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 0, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 10]");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, "", 1L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, , 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, , 1, 10]");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) '#', (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (short) 10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 0L, (-1L), 10.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0, -1, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0, -1, 10.0, 1]");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 100]");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), 100.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100.0, 1.0]");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 1.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, interpreter4, 10.0d, 100.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 100, (short) -1, (byte) 0, '#', (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 0, 35, 0, 32]");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, obj3, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 0, (short) 10, (byte) 0, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 10, 0, 10, 52]");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) false, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) interpreter3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 'a', (-1), (short) 10, (byte) -1, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, -1, 10, -1, 10, 1]");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) interpreter3, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (short) 1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0d, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, 10, (byte) 10, (byte) 100, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 10, 100, 10, -1]");
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) true, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1]");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 1]");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 1.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (short) 0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0d, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, obj3, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 0, (byte) 0, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 1]");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, false, (short) 1, (short) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, false, 1, 0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, false, 1, 0, 0, -1]");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) (byte) 10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 'a', '#', '#', (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 35, 35, 1, 10]");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1.0f, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 10L, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 100.0f, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) (short) 1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10]");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 10]");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (short) 0, (short) -1, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, -1, 100, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, -1, 100, 4]");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) "hi!", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 0, ' ', 100, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, 100, 1, 1]");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray10 = new java.lang.Object[] { obj3, (byte) -1, obj6, (-1.0f), "hi!", (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 100L, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (short) -1, wildcardClass6, (-1.0f), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, -1, class java.lang.Object, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, -1, class java.lang.Object, -1.0, 0]");
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (byte) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 'a', (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 52]");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 100L, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) interpreter3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '#', '#', (-1), (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 35, -1, 10, 10]");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 1, -1.0]");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) (short) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (-1.0d), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, -1.0, 1]");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, '#', 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, #, 0]");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) -1, (short) 10, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 10, 1]");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 10, '#', '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 35, 0]");
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) true, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, (byte) 100, 1.0f, (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100, 1.0, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100, 1.0, 0, 0]");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (short) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1, (-1.0d), wildcardClass6, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, -1.0, class com.google.javascript.rhino.head.Interpreter, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, -1.0, class com.google.javascript.rhino.head.Interpreter, 4, 100]");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, "hi!", 10, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), 10, (byte) 100, 100L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 10, 100, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 10, 100, 100, -1.0]");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 100.0]");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass4, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object, 1]");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) 10L, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 1.0d, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 1, ' ', (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 32, 1, 1]");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 100, (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 35]");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, interpreter4, (short) 1, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 100.0d, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 0, 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, 0, 1, 35]");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) interpreter3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0f, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, -1, 100]");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) wildcardClass4, (java.lang.Object) interpreter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) wildcardClass4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0d, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 10L, 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 10, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 10, 1, 1.0]");
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 10.0f, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', obj3, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }
}

