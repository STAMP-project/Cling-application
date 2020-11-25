import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = interpreter0.compile(compilerEnvirons1, scriptNode2, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = interpreter0.compile(compilerEnvirons1, scriptNode2, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.RhinoException rhinoException1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptStackElement[][] scriptStackElementArray2 = interpreter0.getScriptStackElements(rhinoException1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.RhinoException rhinoException1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = interpreter0.getPatchedStack(rhinoException1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.rhino.head.Context context0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.NativeContinuation nativeContinuation1 = com.google.javascript.rhino.head.Interpreter.captureContinuation(context0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Script script1 = null;
        // The following exception was thrown during execution in test generation
        try {
            interpreter0.setEvalScriptFlag(script1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 1, 0, 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, 0, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, 0, 10, 1]");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = interpreter0.compile(compilerEnvirons1, scriptNode2, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = interpreter0.getSourcePositionFromStack(context1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.RhinoException rhinoException1 = null;
        // The following exception was thrown during execution in test generation
        try {
            interpreter0.captureStackInfo(rhinoException1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = interpreter0.compile(compilerEnvirons1, scriptNode2, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0f, 1, (byte) -1, 10.0f, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, 1, -1, 10.0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0, 1, -1, 10.0, 1, 1]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) true, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', (-1.0d), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, -1.0, -1]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.RhinoException rhinoException1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = interpreter0.getPatchedStack(rhinoException1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.RhinoException rhinoException1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = interpreter0.getScriptStack(rhinoException1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d), (byte) -1, false, 0.0d, 100L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, -1, false, 0.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, -1, false, 0.0, 100, 100]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) 10.0f, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 1, 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 10]");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 1L, 1L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 1, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 1, 1, 10]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 1.0f, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, (-1L), 0.0f, (-1), 1L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, -1, 0.0, -1, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, -1, 0.0, -1, 1, -1.0]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3, (short) 100 };
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (byte) 10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) false, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 0, (byte) 0, (byte) 1 };
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 100, 1, 1L, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 100, 1, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 100, 1, 1, ]");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (-1.0f), (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { '#', 100 };
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, true]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) (byte) 0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 0.0f, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, obj3, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, '#', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, #, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, #, -1]");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray7 = new java.lang.Object[] { interpreter3, 'a', "", 0L };
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 'a', (byte) 0, '4', (short) -1, 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 0, 52, -1, 10, 0]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) false, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 100.0d, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) -1, (-1), '#', (short) 0, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 35, 0, 10, 35]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) -1, (byte) -1, (short) 100, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, 100, 0, 97]");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = interpreter0.getSourcePositionFromStack(context1, intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0, interpreter4, 0L, (short) 10, interpreter8, 1.0d };
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 10, '4', 1, 'a', 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 52, 1, 97, 100, -1]");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 1.0f, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 1.0, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 1.0, 10, #]");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 1, (byte) 10, '4', 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 52, 0, 10]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, 10]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) ' ', (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", "", 1L, 100.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, , 1, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, , 1, 100.0, 10]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass6 = interpreter5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, (short) 0, interpreter5 };
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', (short) 100, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, -1, 0]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) wildcardClass2, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass2 = interpreter1.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script5 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) interpreter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) '#', (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, 'a', false, wildcardClass7, interpreter8, (byte) -1 };
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) (byte) 10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 1.0f, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, ' ', 10L, (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0,  , 10, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0,  , 10, -1, 10]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter5 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 1.0d, interpreter5, obj6, 100 };
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (short) 10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1L), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0f, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) -1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, obj3, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) (byte) -1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 10, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52, 0]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { interpreter3, (-1.0f), 100, 10.0f, (short) 10 };
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) (byte) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 100]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', (short) 10, (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 10, 97]");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 0L, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 0, 1L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 0, 1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 0, 1, #]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0d, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 10, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 10, (short) 10, 0, (short) 0, 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10, 0, 0, 0, -1]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 10, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 0, (byte) 100, '#', 1, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 35, 1, 1, -1]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, obj3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 100.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), 1, '#', (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 35, 1, -1]");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) wildcardClass4, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (-1), (byte) 1, 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 97, 52, 52]");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 1, 100, (byte) 100, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, 100, 1, 10]");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { (short) 100, (-1), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (-1), 100 };
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 10L, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter7 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0d), 10.0d, (byte) 10, interpreter7 };
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, ' ', (-1.0d), 1.0d, wildcardClass8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0,  , -1.0, 1.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0,  , -1.0, 1.0, class java.lang.Object]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 100.0f, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter1 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) interpreter1, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 0, (byte) 10, obj5, 0.0f, ' ', wildcardClass9 };
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) -1, (short) 10, (-1), (byte) 1, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10, -1, 1, 10, -1]");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (short) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100L, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', 10, 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 100, 100]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0d, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 10, '#', 'a', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 97, -1]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) false, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 1, 1, 0, (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 0, -1, 35]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { '4', (byte) 0, 100, '#', (-1), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 0, 100, 35, -1, 100]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, (byte) 1, 0, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 0, 10, -1]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 10.0d, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (short) 0, false, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, false, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, false, -1.0, 100]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, true, 1L, 10.0f, 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, true, 1, 10.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, true, 1, 10.0, 100, 1]");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 1L, (-1), (-1), false, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, 1, -1, -1, false, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, 1, -1, -1, false, 4]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 0, 100, 32]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) '#', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10.0]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) 10.0d, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, ' ', (byte) 100, obj7 };
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) false, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) (short) 0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) interpreter3, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) (byte) -1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { interpreter3, (-1.0f), (byte) 1, "", 1, '4' };
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass4, (-1.0f), "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class java.lang.Object, -1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class java.lang.Object, -1.0, hi!]");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 0.0d, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) ' ', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '#', (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 1, (-1), (byte) 100, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 100, 1, 100]");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 0, 1, (short) 0, (short) 0 };
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 0L, (short) 10, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 0, 10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 0, 10, true]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', (-1.0f), (-1.0d), 'a', (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, -1.0, -1.0, a, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, -1.0, -1.0, a, 1, 100]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (short) -1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 100, (short) 100 };
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 0L, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0.0]");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) (byte) -1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, (java.lang.Object) 10.0d, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0f, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 10, '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, 10]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 'a', (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 52]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 0, '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, 97]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', "hi!", 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, hi!, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, hi!, 0.0]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, 1, (short) 10, 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 10, 100, 100]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 0.0d, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) wildcardClass4, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (byte) 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100, 0.0]");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35]");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, obj4, 'a' };
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) interpreter3, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { '4', 'a', '4', 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 97, 52, 10, 100]");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 1, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 52]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (-1), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0d, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) 100, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', obj3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { false, (short) 0, 0L, (short) 1, '4', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[false, 0, 0, 1, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[false, 0, 0, 1, 4, 10.0]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, 10.0d, (-1), 1.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 10.0, -1, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 10.0, -1, 1.0, -1.0]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) -1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 100, (-1), '4', ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 52, 32, -1]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 100, '4', 10, (short) 1, 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 52, 10, 1, 0, 10]");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, -1]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (-1), (java.lang.Object) "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 100, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 0]");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, obj3, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) (byte) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) ' ', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1L, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, -1]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0f, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0d, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) 1.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 1L, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 10.0f, 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10.0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10.0, 1, -1]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 0, 100, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 52, 0]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '4', (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 0L, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) interpreter3, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) -1, "hi!", 1L, (byte) 0, (-1.0d), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, hi!, 1, 0, -1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, hi!, 1, 0, -1.0, 1.0]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, 10, (short) 0, (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 0, 10, -1]");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 1, '#', 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 10, 1]");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 100, (short) -1, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, -1, -1]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) false, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) 100, 100, (short) 1, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 1, -1, 1]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, obj4, 1.0d, (byte) 100 };
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) (short) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 1.0f, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) (byte) 0, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 1, (java.lang.Object) 0.0d, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) interpreter3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass4, "hi!", '4', 1.0d, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class java.lang.Object, hi!, 4, 1.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class java.lang.Object, hi!, 4, 1.0, false]");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) 1, 'a', (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 1, 0]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) ' ', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { ' ', (-1) };
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) (-1.0d), (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 0, '#', (byte) 1, 1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35, 1, 1, 100, 97]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0f, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 'a', (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0d, ' ', 1L, (-1), "hi!", '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0,  , 1, -1, hi!, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0,  , 1, -1, hi!, #]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (byte) -1, ' ', 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 10, 97]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) "hi!", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 0, 10, (short) 10, (short) 1, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10, 10, 1, -1, 0]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, (short) 100, 'a', (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, 97, 0, 100]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (byte) 10, 'a', (byte) 1, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 97, 1, 10, 10]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { ' ', '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 0]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 100.0f, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0d, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (byte) 100, ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100,  , 100.0]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject(obj1, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) false, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100.0d, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10.0d, 1L, (short) 1, (byte) 1, (byte) -1, obj8 };
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52]");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 100.0d, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { 0, (byte) 100, ' ', (short) 0, (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, 32, 0, 10, 97]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { ' ', (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1, 35]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) '#', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100]");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0f, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 100, (java.lang.Object) (byte) 0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 1.0d, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { '4', (short) 100, (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, -1, 97]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) ' ', (java.lang.Object) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, obj4, 0 };
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0d, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) (short) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 0, (java.lang.Object) 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (byte) 1, (short) 100, (byte) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, 100, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, 100, 0, 100]");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, obj3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1.0d, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0f), (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) 0.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Interpreter interpreter6 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass7 = interpreter6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { wildcardClass4, 10.0f, wildcardClass7, 10L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[class java.lang.Object, 10.0, class com.google.javascript.rhino.head.Interpreter, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[class java.lang.Object, 10.0, class com.google.javascript.rhino.head.Interpreter, 10, 4]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { (short) -1, (short) 1, '4', '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 52, 52, 0]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) '4', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 10.0d, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (byte) -1, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 10, (java.lang.Object) "", obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[hi!]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) '4', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 10.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 10.0f, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 100, (java.lang.Object) (-1L), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) -1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) -1, (java.lang.Object) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) -1, 1, (byte) 0, (byte) 0, (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 0, 0, 100, 32]");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1]");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 10, obj3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (byte) 100, 0, ' ', (short) 0, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0, 32, 0, -1, 0]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { interpreter3, "", (short) 1, 1L, (short) 0, true };
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) wildcardClass4, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object[] objArray4 = new java.lang.Object[] { interpreter3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) false, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (-1.0d), (-1), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, -1.0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, -1.0, -1, 1]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100]");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) interpreter3, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0d, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray3 = new int[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = interpreter0.getSourcePositionFromStack(context1, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 0.0f, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 10.0d, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) (short) 10, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) (-1.0f), (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1L, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 1.0d, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 10, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { (short) 1, (byte) -1, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 97, 35]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) true, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1.0d), (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) true, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) (byte) 10, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 100, (short) 100, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 35, 1]");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Interpreter interpreter2 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass3 = interpreter2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) (byte) 100, (java.lang.Object) interpreter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script4 = interpreter0.createScriptObject((java.lang.Object) 10, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter8 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass9 = interpreter8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, (short) 100, 10.0f, (short) 1, 10L, wildcardClass9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 100, 10.0, 1, 10, class com.google.javascript.rhino.head.Interpreter]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 100, 10.0, 1, 10, class com.google.javascript.rhino.head.Interpreter]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = interpreter0.getSourcePositionFromStack(context1, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, -1, -1]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1.0d), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) 'a', (java.lang.Object) 10.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, obj3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray7 = new int[] { 0, (short) 100, (byte) -1, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = interpreter0.getSourcePositionFromStack(context1, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100, -1, 100, 100]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '#', (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, obj3, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 10, (java.lang.Object) interpreter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1L), (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) -1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) '4', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, interpreter4 };
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) true, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) "", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function6 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) interpreter3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 100L, obj5, 10.0d, "" };
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10.0f, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0.0]");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 100.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 100.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 100.0, 0.0]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (-1), (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (byte) 10, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 0.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, 0.0d, (byte) 10, (byte) 0, "hi!", 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 0.0, 10, 0, hi!, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 0.0, 10, 0, hi!, 0]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter4 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass5 = interpreter4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, interpreter4, 0.0d };
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100, (short) 1, obj5, "", (short) 100, (short) 10 };
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '#', (java.lang.Object) (short) 100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 0.0d, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 100L, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (-1L), obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = interpreter0.getSourcePositionFromStack(context1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3, 100L };
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 10L, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray4 = new int[] { 10, 10 };
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray5 = new int[] { 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = interpreter0.getSourcePositionFromStack(context1, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 32, 97]");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) false, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) -1, (java.lang.Object) 'a', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 100, (java.lang.Object) 10.0f, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) '4', (java.lang.Object) 100L, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        int[] intArray8 = new int[] { (short) 10, (short) -1, (-1), (short) 0, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = interpreter0.getSourcePositionFromStack(context1, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, -1, -1, 0, 1, 1]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 1, (java.lang.Object) 1.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) (short) 1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, 100.0d, (-1.0f), "hi!", ' ', true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, 100.0, -1.0, hi!,  , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, 100.0, -1.0, hi!,  , true]");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (byte) 1, (java.lang.Object) 0L, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        com.google.javascript.rhino.head.Interpreter interpreter3 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Class<?> wildcardClass4 = interpreter3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { interpreter3, 0L };
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, 10L, '4', 10L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10, 4, 10, 0.0]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0.0f, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 10L, 100L, (short) 100, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 10, 100, 100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 10, 100, 100, ]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 0, (java.lang.Object) 10.0d, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) (short) 0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject(obj1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: No Context associated with current Thread");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.rhino.head.NativeContinuation nativeContinuation0 = null;
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1L), false, (short) 0, (-1), ' ', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.Interpreter.restartContinuation(nativeContinuation0, context1, scriptable2, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, false, 0, -1,  , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, false, 0, -1,  , -1]");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 0L, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, (int) (short) 10, (java.lang.Object) 100.0d, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 100L, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.Interpreter.resumeGenerator(context0, scriptable1, 0, (java.lang.Object) 0L, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Script script3 = interpreter0.createScriptObject((java.lang.Object) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.rhino.head.Interpreter interpreter0 = new com.google.javascript.rhino.head.Interpreter();
        com.google.javascript.rhino.head.Context context1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Function function5 = interpreter0.createFunctionObject(context1, scriptable2, (java.lang.Object) 1.0d, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }
}

