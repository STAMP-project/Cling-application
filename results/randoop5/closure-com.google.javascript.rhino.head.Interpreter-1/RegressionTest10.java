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
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, obj3, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 100L };
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
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass4, (byte) 100, (byte) 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, 100, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, 100, 0, 10.0]");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 0, 'a', (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97, 0, 0, -1]");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (byte) 10, '#', (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 10, #, 0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 10, #, 0,  ]");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) interpreter3, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 10, (short) 100, (-1), (byte) 100, (short) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100, -1, 100, -1, 0]");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 0, 35]");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '#', (-1.0d), 100.0f, 1L, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[#, -1.0, 100.0, 1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[#, -1.0, 100.0, 1, 10, 1]");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

