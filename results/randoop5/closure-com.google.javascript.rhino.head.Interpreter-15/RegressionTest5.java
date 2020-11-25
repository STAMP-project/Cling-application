import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { ' ', (-1), 1, 0, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, -1, 1, 0, 10, 1]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 1, '4', (byte) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 10, 0]");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) "hi!", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 4, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 4, -1]");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 0.0d, 0, (-1.0d), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, 0.0, 0, -1.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, 0.0, 0, -1.0, 100.0]");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, obj3, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, ' ', (short) 100, (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 32, 100, 0, 0]");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter6 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, (-1), interpreter6, 100 };
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100L, interpreter5, (short) 0 };
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, (byte) 100, 100.0d, obj6, (byte) 1, interpreter8 };
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 1L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 100, 10]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, 10L, (short) 10, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 10, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 10, 10, 100, -1]");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (short) 100, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 10.0f, "hi!", (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 10.0, hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 10.0, hi!, 1]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 100]");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) (short) -1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', (short) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 1, 100]");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, 10.0d };
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 0.0d, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '4', (short) 1, 100, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 1, 100, 100, 0]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 0.0d, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { true, 100.0f, (-1), (short) -1, (byte) 100, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[true, 100.0, -1, -1, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[true, 100.0, -1, -1, 100, -1.0]");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 'a', (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', (byte) 10, 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 0, 100]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) (byte) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '4', (-1), (short) -1, ' ', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, -1, -1, 32, 10]");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10L, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", interpreter4, 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 0, (short) 10, '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 52, 1]");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 0.0d, false, (byte) 100, 0L, 'a', obj8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { '4', 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 97]");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (byte) -1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) interpreter3, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, (short) -1, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, -1, -1, 35]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) 0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 100.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0f), (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', obj3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, "hi!", (short) 1, 100.0f, false, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, hi!, 1, 100.0, false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, hi!, 1, 100.0, false, 100]");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d), 10.0f, 1L, 1, '4', 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 10.0, 1, 1, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 10.0, 1, 1, 4, 100]");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 97]");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0f), (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 10, ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 1]");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "hi!", (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 10, 0, 10L, 1L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 10, 0, 10, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 10, 0, 10, 1, 4]");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) (short) 10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (byte) 0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) (byte) 10, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1.0d, (short) 10, false, wildcardClass7, (-1.0f), wildcardClass10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1.0, 10, false, class java.lang.Object, -1.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1.0, 10, false, class java.lang.Object, -1.0, class java.lang.Object]");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, obj4, 10, (short) 10, false };
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) wildcardClass4, (java.lang.Object) interpreter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 10.0d, (byte) 100, "", 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10.0, 100, , a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 10.0, 100, , a]");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0.0d, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '#', (short) 0, (short) 1, (short) -1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0, 1, -1, 10]");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 100L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, 1]");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) true, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) (short) -1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) interpreter3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!]");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (-1.0d), (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100]");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', obj3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) wildcardClass4, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (-1L), (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { '4', (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, -1, -1]");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1]");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '4', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 10L, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) 1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 1]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 0.0f, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 100, 1 };
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 1]");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, (short) 0, (-1), wildcardClass7, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0, -1, class java.lang.Object, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0, -1, class java.lang.Object, -1]");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 0.0d, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, hi!]");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 10, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, 10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, 10, false]");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0f, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) wildcardClass4, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, 0.0d, 100.0f, 10.0f, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 0.0, 100.0, 10.0, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 0.0, 100.0, 10.0, 0, 10]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 10, 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, -1]");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 100.0f, 1, false, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100.0, 1, false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100.0, 1, false, 100.0]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) 0L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 1L, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, 0L, 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0, 100, 0]");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 100, 100L, (short) 100, (short) 1, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 100, 100, 1,  ,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 100, 100, 1,  ,  ]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0f, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (byte) -1, false, (-1.0f), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, -1, false, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, -1, false, -1.0, 1]");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", (byte) 100, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 100, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 100, 1, 100]");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1L), (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 0, ' ', 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 32, 10, 0]");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 10.0d, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 10.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, 100]");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) true, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 0, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, -1]");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 1, (byte) -1, (short) 10, 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 10, 1, -1]");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1, 1.0d, (byte) 10, ' ', (byte) 0, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 1.0, 10,  , 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 1.0, 10,  , 0, 0]");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (-1.0d), (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 0.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 0.0, 0]");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0d, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (byte) 10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 0]");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 'a', (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { interpreter3, 100L, (-1L), (-1) };
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 0, (short) -1, 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, -1]");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (-1), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, '#', 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, #, 0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, #, 0.0, 1.0]");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 1, 'a', (short) 1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 97, 1, 100, 97]");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0f, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), '4', 1L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 4, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 4, 1, 0]");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) 1.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, obj3, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (short) -1, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 1.0d, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) -1, (-1), (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 100, 10]");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) (byte) -1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10]");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 10, '4', (short) 1, (-1), 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 52, 1, -1, 100, 100]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, (short) 100, (-1), 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, -1, 1, 10]");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', '4', 0L, (byte) 10, obj7 };
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, 0]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 100, (byte) -1, (byte) 100, 1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 100, -1, 100, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 100, -1, 100, 1, 100.0]");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10]");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 1L, 10.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 1, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 1, 10.0, 100]");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, interpreter4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { ' ', (byte) -1, (byte) 0, (byte) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, -1, 0, 10, 10]");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 100.0f, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) (short) 100, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 100]");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) interpreter3, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 1L, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 10.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', 10, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 100, 1]");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0f, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1), wildcardClass5, 1, (-1.0f), (-1.0d), "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, class com.google.javascript.rhino.head.Interpreter, 1, -1.0, -1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, class com.google.javascript.rhino.head.Interpreter, 1, -1.0, -1.0, ]");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, (-1.0f), (byte) -1, 0.0f, false };
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { ' ', 10, (short) 0, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 10, 0, 10, -1]");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, (short) 10, ' ', 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 32, 100, -1]");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, obj3, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 0.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass9 = interpreter8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 1, (byte) 100, 100.0f, ' ', 100.0d, wildcardClass9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 100, 100.0,  , 100.0, class com.google.javascript.rhino.head.Interpreter]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 100, 100.0,  , 100.0, class com.google.javascript.rhino.head.Interpreter]");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 52]");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 100L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) -1, (short) 1, (-1.0f), true, 10.0f, wildcardClass9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 1, -1.0, true, 10.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 1, -1.0, true, 10.0, class java.lang.Object]");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 100L, (short) 100, (byte) 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 100, 100, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 100, 100, 1, 0.0]");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 10.0f, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 1L, true, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1, true, 1]");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) (-1L), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (-1L), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 10, (byte) 1, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, -1]");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) (byte) 0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) '4', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass9 = interpreter8.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1), obj4, 1.0d, (byte) 10, wildcardClass9, wildcardClass11 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 'a', 1.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, a, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, a, 1.0, -1]");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, (byte) 100, 1, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 1, 1, 100]");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d, (byte) 100, wildcardClass6, 0L, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, 100, class com.google.javascript.rhino.head.Interpreter, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0, 100, class com.google.javascript.rhino.head.Interpreter, 0, 100.0]");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, -1]");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, obj3, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, 10]");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 10, 'a', (short) 100, '4', 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 97, 100, 52, 10, 100]");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, obj3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 100, 1.0d, (byte) 10, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100, 1.0, 10, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100, 1.0, 10, hi!]");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 1.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 10L, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) false, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, -1, 1]");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 1.0d, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) wildcardClass2, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) -1, (byte) 1 };
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
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (-1L), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, interpreter4, 0L };
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
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, obj3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) wildcardClass4, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, 10]");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 100, ' ', (byte) 100, (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 32, 100, -1, 97]");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (short) -1, "hi!", (byte) 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, -1, hi!, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, -1, hi!, 1, 10.0]");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', (short) 0, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 0, 35, 35]");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 0.0d, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, 10.0]");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, "", 100, 100.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, , 100, 100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, , 100, 100.0, 1.0]");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 1, 10, (short) 0 };
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
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { '4', (short) 10, (short) 1, '#', 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 10, 1, 35, 100, 52]");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 10, 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 1]");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', obj3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 'a', (byte) -1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 100, 97]");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, 1L, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 1, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 1, 100, 1]");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { ' ', (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 100, 0]");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { obj3, 0.0d, 1.0d, (byte) 0, (short) 10, 100.0f };
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
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (short) -1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, true, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, true, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, true, 0]");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, ]");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (short) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1, 0]");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass9 = interpreter8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10, true, "", 0.0d, interpreter8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, class com.google.javascript.rhino.head.Interpreter]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, class com.google.javascript.rhino.head.Interpreter]");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 32, 100]");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) (byte) 10, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 100, (byte) 1, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, -1, 32]");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) (short) 10, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) true, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (short) 1, 1.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 1, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 1, 1.0, 1]");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (short) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 1, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 100]");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '4', (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, (-1.0f), false, obj6, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 10, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) (byte) -1, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 100, (short) 0, (byte) 100, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, 100, 0, 100]");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 1, (byte) -1, '4', (byte) 0, (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, -1, 52, 0, 0, 32]");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1L), (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 10]");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 0.0d, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 100, (short) 10, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 1, 100]");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) 1.0d, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, (-1.0f), 100.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, -1.0, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, -1.0, 100.0, 1]");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, 0.0f, '#', (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0.0, #, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0.0, #, -1, 10]");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 1.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) (short) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 0, 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 32]");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) (short) 100, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[class java.lang.Object]");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 100, a]");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) -1, 1, (short) 10, (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 10, 100, 52]");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (short) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (-1L), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 0, (short) 10 };
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100]");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter7 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, (-1L), 1L, 'a', interpreter7, 0.0d };
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
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject(obj1, (java.lang.Object) interpreter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '#', (byte) 10, (byte) 1, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 10, 1, 100, 52]");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) wildcardClass2, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10L, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (short) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) "", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 10, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 1]");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0f, wildcardClass5, (byte) 1, (-1L), '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, class com.google.javascript.rhino.head.Interpreter, 1, -1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0, class com.google.javascript.rhino.head.Interpreter, 1, -1, 4]");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '4', (byte) 1, (byte) 100, (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 1, 100, 100, 35]");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { ' ', 0, (-1), (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 0, -1, -1, 100]");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 1, (byte) 100, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 1, 100, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 1, 100, -1, 0]");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, (-1), '#', 1, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1, #, 1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1, #, 1, true]");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, -1.0]");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 1.0d, '4', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 1.0, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 1.0, 4, 10.0]");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (short) 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { '#', (byte) 0, (-1), 1, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0, -1, 1, -1, -1]");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 10L, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 1, 0, (byte) 0, wildcardClass7, (-1.0f), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 0, 0, class java.lang.Object, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1, 0, 0, class java.lang.Object, -1.0, -1]");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', interpreter4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 'a', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, a, 10]");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 1.0]");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) (byte) 100, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1L), (short) 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1, 1, 1.0]");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, (byte) 100, (byte) 0, ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 0, 32, -1]");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 0, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, -1]");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 1, (byte) 100, '4', (byte) 1, 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 100, 52, 1, 1, 100]");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 1, (short) 10, 100, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 100, 10, 52]");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 1.0f, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 10, (byte) -1, 0, ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, -1, 0, 32, 10]");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0f), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 0, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 32]");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) -1, 10, '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 35, 10]");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { ' ', (short) 10, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 10, 35, 32]");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 'a', 'a', (byte) 1, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97, 1, 10, 35]");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter7 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 10L, (short) 1, '4', interpreter7 };
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
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), obj3, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (short) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, obj4, 100.0d, "", (byte) 0, (short) 0 };
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
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0d, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 100.0f, (byte) -1, (-1L) };
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
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, '4', 10L, 10L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 4, 10, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 4, 10, 10, 1.0]");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 1, 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 52]");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 'a', (byte) 1, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 1, 100]");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) -1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0d, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0f), (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (byte) 1, (short) 0, (short) 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1, 0, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1, 0, 10, 1.0]");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 0, (byte) -1, 1, (short) 1, (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 1, 1, -1, 35]");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1]");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 100L, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 10, 10, (short) 10, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 10, 52, 1]");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 0, (byte) 1, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 0, 0]");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1]");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, '#', (-1), (-1), (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35, -1, -1, 100, 0]");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, obj3, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 1L, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, obj3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32]");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0]");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (short) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) (-1), (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, (byte) 10, 100, 0, (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 100, 0, -1, 97]");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, '#' };
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
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 10.0f, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 0, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 1]");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10]");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) (-1L), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 100, true, (short) 1, 1.0d, (-1.0d), 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, true, 1, 1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, true, 1, 1.0, -1.0, 100]");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) (short) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, '4', (byte) -1, wildcardClass7, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 4, -1, class java.lang.Object, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 4, -1, class java.lang.Object, 100]");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, (byte) -1, '#', '4', 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 35, 52, 100, 10]");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, obj3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 0]");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, -1]");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) wildcardClass4, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 4]");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) -1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 100, 1, 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 0, 35]");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) (byte) 100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '4', (-1), (short) 1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, -1, 1, 100, 97]");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1]");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '4', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 97]");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, obj3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0f, obj4, 'a', (short) -1, (-1), (-1L) };
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
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) 0L, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }
}

