import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) "", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 0L, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 10, '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, -1]");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { interpreter3, (short) 0, 100.0d };
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
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "hi!", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (short) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (-1.0d), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 100, ' ', (byte) 10, 'a', (short) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32, 10, 97, 0, 1]");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 100, 0.0f, (-1L), 1, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 0.0, -1, 1, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 0.0, -1, 1, 100, -1]");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) "hi!", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 100.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) -1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, (short) 0, 0, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 0, 1, 100]");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, "hi!", 0.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, hi!, 0.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, hi!, 0.0, -1.0]");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0]");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', 10L, true, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , 10, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , 10, true, #]");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) -1, 'a', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 0]");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 100, ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, 100]");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) ' ', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (short) -1 };
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
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 4, 1]");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0,  ]");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) (byte) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1]");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, a]");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (short) 0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (short) 10, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, (short) 100, (-1), (short) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, -1, -1, -1]");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 1L, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '4', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (byte) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) false, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 'a', 1.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, a, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, a, 1.0, 1]");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 0.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 100.0d, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 10L, (byte) 1, 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10, 1, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 10, 1, 10, 0]");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', obj3, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 100, 'a', 10.0d, (short) 100, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, a, 10.0, 100, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, a, 10.0, 100, 10.0, -1]");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject(obj1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 1.0d, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 0L, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, ' ', 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true,  , 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true,  , 0, 1]");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 'a', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { '4', '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 35, 1]");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "", obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), (short) 10, 0, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 0, 97, 1]");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 100, 1, (byte) 1, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 1, -1, 10]");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) -1, wildcardClass5, "", 0.0d, (short) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, class com.google.javascript.rhino.head.Interpreter, , 0.0, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, class com.google.javascript.rhino.head.Interpreter, , 0.0, -1, 0.0]");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, "", 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, , 0]");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, (short) 10, (short) 1 };
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
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), true, (byte) -1, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, true, -1, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, true, -1, 4, 0]");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 10, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) "hi!", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 'a', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { ' ', (-1), (short) 100, '4', (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, -1, 100, 52, -1, 1]");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) (short) 0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (byte) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, "hi!", 10.0f, 1.0f, (-1.0f), interpreter8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 0.0d, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '#', (short) 1, (byte) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 10, 32]");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d, (short) 0, ' ', 'a', 0.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, 0,  , a, 0.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0, 0,  , a, 0.0,  ]");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 10, ' ', (byte) 100, (short) 1, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, 1, 1, 10]");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 'a', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 0.0d, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (byte) 1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 100, (short) 100, (byte) 0, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 0, 10, 1]");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, (byte) 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 10, 100]");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', 100, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 32, -1]");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 10, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 97]");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) interpreter3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 'a', (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 97, 1]");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 10, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10]");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, ]");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10.0]");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) '4', (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) -1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { ' ', (byte) 1, (short) 100, '4', (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 1, 100, 52, 1, 10]");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1), "hi!", (short) 0, false, (-1.0f), interpreter8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1]");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj3, 100, interpreter5 };
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
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 'a', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 'a', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) (short) -1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 0.0d, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '4', (byte) -1, 10, (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, -1, 10, 0, 100]");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, false]");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 10, (short) 10, (short) 10, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 10, -1, 100]");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 100, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (short) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 0, 0]");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (short) 1, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { wildcardClass4, (byte) 0, false, (-1), 100L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[class com.google.javascript.rhino.head.Interpreter, 0, false, -1, 100, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[class com.google.javascript.rhino.head.Interpreter, 0, false, -1, 100, #]");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (short) 1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "hi!", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 1L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (-1L), (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 10, (byte) -1, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 32, 0]");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 10, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 35]");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (-1), (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1]");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) '4', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) true, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 1, (short) 1 };
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
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 100L, "hi!", (short) 100, (short) 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100, hi!, 100, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100, hi!, 100, 0, 0.0]");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) 0.0d, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, obj3, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), '4', 100, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 52, 100, 100, -1]");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 0.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, "hi!", 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, hi!, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, hi!, 0, 100]");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 0, 1, (-1), (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, -1, 0, 97]");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) false, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 1.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', obj3, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0f, "hi!", (short) 100, 100.0f, true, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!, 100, 100.0, true, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!, 100, 100.0, true, 10.0]");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 'a', (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 100]");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 10, (byte) 10, (short) 10, (short) 0, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10, 10, 0, -1, -1]");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 10, 'a', 100.0f, 100.0f, obj7, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 1L, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, 0.0]");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 1 };
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
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (-1), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, -1]");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, ' ', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0,  , -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0,  , -1.0]");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) true, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) true, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) '#', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) -1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, 10]");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (-1), (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (-1.0d), (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) "hi!", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, interpreter4, 100, "hi!", (-1.0d) };
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
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) (-1L), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 100.0d, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (byte) -1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, obj4, (-1L), (short) 1, 'a', 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { interpreter3, '4', '4', 100.0d };
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
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { interpreter3, interpreter5, 1.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', "", interpreter5, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) 10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', 100, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 1, 10]");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0.0f, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { ' ', (short) 10, (byte) -1, '#', (byte) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 10, -1, 35, 10, 52]");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 0L, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { ' ', (byte) 100 };
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
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, (byte) 1, 100.0d, 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 1, 100.0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 1, 100.0, 1, 1]");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 1.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) wildcardClass2, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, "hi!", (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, hi!, 100]");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 100.0d, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, 0L, 0.0f, obj6, 1.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, (short) 0, true, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 0, true, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 0, true, -1]");
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (-1.0d), (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, (byte) 100, '#', 1L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100, #, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100, #, 1, 1]");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 1]");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 10.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 100.0f, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 1L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, obj3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 32]");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 10.0d, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 10.0d, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, 1, '4', (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 52, 1, 1]");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) '4', (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, obj3, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 1]");
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 'a', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, '4', 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 4, 0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 4, 0.0, 1.0]");
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, 10.0d, 1.0d, 100, 100L, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 10.0, 1.0, 100, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 10.0, 1.0, 100, 100, false]");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 10, '4', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, 4, 0]");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 0.0f, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) true, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), (byte) 1, 100, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 100, 52, 1]");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 0L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 'a', (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 10, 35]");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) (short) -1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 'a', 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 35]");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 1.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1]");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 0, (short) 100, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, -1, 1]");
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 1.0f, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, 0, (short) 100, ' ', (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 100, 32, 10, 0]");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray10 = new java.lang.Object[] { obj3, 'a', obj5, obj7, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) wildcardClass2, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) interpreter3, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, 10, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, -1.0, 100]");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, 100.0]");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, '4', 10.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, 4, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, 4, 10.0, 0]");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', ' ', 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 32, 100, 100]");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (short) 100, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 10, (byte) 100, (-1), (short) 0, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100, -1, 0, 100, -1]");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { '#', (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 100, 97]");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, false, 1, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, false, 1, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, false, 1, 1, 10]");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) false, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (short) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) wildcardClass4, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 'a', 'a', (short) -1, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, a, a, -1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, a, a, -1, true]");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 1L, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { ' ', (-1), 'a', 'a', (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, -1, 97, 97, -1, 35]");
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) false, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) false, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 1, '4', (byte) 100, (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 52, 100, 10, 100]");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, #,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, #,  ]");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, obj3, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) -1, '#', 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 0, 10]");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 1, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0]");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 10.0f, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) interpreter3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 0.0d, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass4, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object, #]");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (byte) -1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, hi!]");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) (short) 10, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, (short) 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100, 1.0]");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) interpreter3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, false, (byte) 100, (-1L), 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, false, 100, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, false, 100, -1, 1]");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (-1.0d), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), (byte) 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 1, -1.0]");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, (short) 0, 100.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 0, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 0, 100.0, 0]");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) (byte) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, ' ', (byte) 100, (byte) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10,  , 100, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10,  , 100, 1, 0]");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 0, (-1L), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 0, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 0, -1, 100]");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, 1.0f, interpreter5, 10L };
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
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (byte) 10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (byte) 100, true, 10.0f, obj7, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 100.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { wildcardClass4, 0.0f, 100, 0.0d, 1.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[class java.lang.Object, 0.0, 100, 0.0, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[class java.lang.Object, 0.0, 100, 0.0, 1.0, 100]");
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', obj3, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 10, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10]");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (byte) 1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 0, 100, 10, (short) -1, 100.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 100, 10, -1, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 100, 10, -1, 100.0, 1]");
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0d, 1L, (-1L), (short) -1, 1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0, 1, -1, -1, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0, 1, -1, -1, 1, 100.0]");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (byte) 0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, obj3, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 10, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (short) -1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 100, '#', (byte) 1, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, 1, 1, -1]");
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 100, 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 1, 10, 0]");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (-1.0d), (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { '#', (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0, 32]");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 1]");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 100, (short) 10, (short) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, -1, -1]");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, a]");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 0.0f, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { interpreter3, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (byte) 0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, true]");
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { true, (-1L), (byte) 10, true, 10.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[true, -1, 10, true, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[true, -1, 10, true, 10.0, 1]");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 0, 100, 100, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 100, 0, 100]");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 'a', (byte) 1, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 1, 35]");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), ' ', (byte) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 10, -1, 100]");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) '#', (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, "", (byte) 1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, , 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, , 1, 10.0]");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '4', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 100, (byte) 1, (byte) 0, 100.0d, obj7, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, obj3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, obj3, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

