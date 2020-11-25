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
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray10 = new java.lang.Object[] { objArray4, (-1), 100, 100L, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[[], -1, 100, 100, #, #]");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (short) 100, (-1.0f), (-1L), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100, -1.0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100, -1.0, -1, 0]");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (byte) 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100, 0]");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 100, 100.0d, 10L, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0]");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 8]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 1.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1.0, 10]");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100.0d, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', (java.lang.Object) scriptable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d, 10L, (short) 10, objArray6, (-1.0f), 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, 10, 10, [], -1.0, 0.0]");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 13, 0.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[13, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[13, 0.0, 100.0]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1]");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1]");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 1.0f, (short) 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[hi!, 1.0, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[hi!, 1.0, 100, 1.0]");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0d), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { scriptable3, 100, (short) 10, obj7, false, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 13, 10L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[13, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[13, 10, 1]");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, 4, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 4, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 4, 2]");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 13, 1L, (byte) 0, (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[13, 1, 0, 0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[13, 1, 0, 0,  ]");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, 100.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 100.0, 100]");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 1, 0L, 0.0f, 1L, 4, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0, 0.0, 1, 4, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0, 0.0, 1, 4, ]");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (-1.0f), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, -1.0, -1]");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, (-1.0f), 100, 2, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 2]");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (short) 10, 1.0f, 100L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 1.0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 1.0, 100, 10]");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1, 1]");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 10]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, "hi!", (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, hi!, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, hi!, -1.0]");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { objArray3, 4, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 4, 10]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 10.0d, '#', 1.0d, "", 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10.0, #, 1.0, , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10.0, #, 1.0, , 10]");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (-1L), 100, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, "hi!", '#', 10L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, hi!, #, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, hi!, #, 10, 0]");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 100, obj4, objArray6, (-1.0f), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 8, (short) -1, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1, 1.0d, objArray6, 100L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 1.0, [], 100, 0]");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (-1), obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10.0d, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), wildcardClass4, 10L, (short) -1, (short) -1, scriptable8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, class java.lang.Object, 10, -1, -1, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, class java.lang.Object, 10, -1, -1, null]");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { scriptable3, (byte) 0, 2, 13, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null, 0, 2, 13, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null, 0, 2, 13, 10]");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable9 = null;
        java.lang.Object[] objArray10 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable9);
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) 10, 100.0f, obj5, 13, 10.0d, wildcardClass11 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) scriptable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100.0d, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", "hi!", (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, hi!, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, hi!, 10]");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0d), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ ]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 13, (-1L), 1L, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[13, -1, 1, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[13, -1, 1, 0, 1]");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0f, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 13, wildcardClass5, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[13, class [Ljava.lang.Object;, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[13, class [Ljava.lang.Object;, 2]");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d), 100, scriptable5, 10L, (short) 0, wildcardClass10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, 100, null, 10, 0, class com.google.javascript.rhino.head.UniqueTag]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, 100, null, 10, 0, class com.google.javascript.rhino.head.UniqueTag]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, 10L, true, ' ', obj7, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray6 = new java.lang.Object[] { scriptable3, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null,  ]");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 100.0]");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100]");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 10, (byte) 0, true, obj6, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, false, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, false, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, false, 0.0]");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 13, (byte) 10, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[13, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[13, 10, 0]");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (-1), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 100]");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 4, (short) 10, 1L, objArray7, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, 10, 1, [], 13]");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) -1, wildcardClass6, ' ', (short) -1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, class [Ljava.lang.Object;,  , -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, class [Ljava.lang.Object;,  , -1, 1]");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, '4', 10.0f, 1.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 4, 10.0, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 4, 10.0, 1.0, 1]");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, #, 0]");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (short) 100, 8, "hi!", (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 100, 8, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 100, 8, hi!, 100]");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 'a', 1L, (-1.0f), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, a, 1, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, a, 1, -1.0, 100]");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj8 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, wildcardClass4, false, (-1), "", obj8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", "hi!", '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, hi!, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, hi!, 4]");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { objArray3, 10.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], 10.0, 0.0]");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, 100]");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (-1.0f), 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, -1.0, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, -1.0, 0, 0.0]");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 100L, "", wildcardClass6, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100, , class com.google.javascript.rhino.head.UniqueTag, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100, , class com.google.javascript.rhino.head.UniqueTag, 4]");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0d), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 4, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, -1.0]");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1), (byte) 10, 0, 100L, 100.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 10, 0, 100, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 10, 0, 100, 100.0, 10]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 4, objArray5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, []]");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray3, 100, 4, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 100, 4, -1]");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 10]");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0f), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 13]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 13, 0L, 10.0d, obj6, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (short) 10, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
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
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", obj4, 4, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (short) 10, 10L, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10, 10, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10, 10, ]");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 0.0f, (byte) 1, (byte) 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0.0, 1, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0.0, 1, 100, 0.0]");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 1.0d, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1.0, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1.0, 0, 0]");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) scriptable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1), 10, scriptable6, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, null, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, null, -1.0]");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 4, 0.0d, (short) 10, '4', 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 0.0, 10, 4, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 0.0, 10, 4, 2]");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', ' ', obj5, obj6, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, 10.0d, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 10.0, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 10.0, 13]");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0,  ]");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray3, (short) 0, 100L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0, 100, -1]");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 100.0d, (byte) 100, (byte) -1, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 100.0, 100, -1, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 100.0, 100, -1, 13]");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 10L, 1, 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 10, 1, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 10, 1, 0, 100]");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { obj3, (short) 100, 1.0d, (byte) 10, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 1L, 10, 0.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 1, 10, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 1, 10, 0.0, 100.0]");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 1.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 1.0, 10]");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 13, 1, (byte) 10, 0.0f, 10.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[13, 1, 10, 0.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[13, 1, 10, 0.0, 10.0, 0]");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, (byte) -1, 100, '4', 4, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 1.0f, (-1), 1.0f, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 1.0, -1, 1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 1.0, -1, 1.0, ]");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, a]");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), obj4, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', '#', (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, #, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, #, 1, 10]");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0f, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 100.0d, (short) 0, (byte) 100, 2, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, 0, 100, 2, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, 0, 100, 2, -1]");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 4, "hi!", 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 4, hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 4, hi!, 1]");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 1L, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1, ]");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) "hi!", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 1.0f, 0.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 1.0, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 1.0, 0.0, 0]");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 1, "", (-1L), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 1, , -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 1, , -1, -1]");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 10, 100, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 100, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 100, 13]");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 13, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[13, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[13, 1]");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 1.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 1.0, 0.0]");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, '4', 4, 2, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 4, 4, 2, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 4, 4, 2, 10]");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0f), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1L, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0.0, 0]");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj8 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 100, wildcardClass5, 4, 1L, obj8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass4, 1.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class [Ljava.lang.Object;, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class [Ljava.lang.Object;, 1.0, 1]");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 1.0d, obj4, 4, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, ' ', (byte) 10, 4, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0,  , 10, 4, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0,  , 10, 4, -1]");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (short) 0, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, 1, 0]");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 8, (-1), (byte) -1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[8, -1, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[8, -1, -1, -1.0]");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, true]");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { objArray3, 100.0f, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 100.0, #, 100]");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray3, wildcardClass6, 1, (short) 1, 100.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], class com.google.javascript.rhino.head.UniqueTag, 1, 1, 100.0, 1]");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1L), wildcardClass4, 10.0d, obj6, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { ' ', 1, 100, "", 1L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[ , 1, 100, , 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[ , 1, 100, , 1, -1.0]");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable9 = null;
        java.lang.Object[] objArray10 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable9);
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) 10, (-1), objArray6, (-1L), objArray10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, [], -1, []]");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0f, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 0.0d, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0.0, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0.0, 10.0, -1]");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 13, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[13, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[13, 100]");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (-1), (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10.0d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj2, (short) -1, obj4, 1.0d, 13, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0d, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray5 = new java.lang.Object[] { objArray3, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[], -1]");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { wildcardClass5, 100.0d, 1.0f, 0L, obj9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', 8, 100L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 8, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 8, 100, -1]");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1.0f), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100, (byte) 100, scriptable5, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 100, null, 100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 100, null, 100,  ]");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 10L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 10, 100.0]");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '#', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 2, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[2, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[2, 0.0]");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (short) 100, 1, (byte) 100, (short) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100, 1, 100, -1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100, 1, 100, -1, 4]");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 2, 8, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 2, 8, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 2, 8, 4]");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj2, 10.0d, ' ', (byte) -1, (byte) 10, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10]");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 8, 1.0f, 0.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[8, 1.0, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[8, 1.0, 0.0, -1]");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1.0]");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0f, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, ]");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { "hi!", 8, wildcardClass6, 0.0f, 8, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 8, class java.lang.Object, 0.0, 8, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 8, class java.lang.Object, 0.0, 8, 0.0]");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1.0f), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0d, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (-1L), 100.0f, wildcardClass8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, -1, 100.0, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, -1, 100.0, class [Ljava.lang.Object;]");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, obj4, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { objArray3, 10.0d, obj6, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { "hi!", obj4, 100.0d, (byte) 1, 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 0L, '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0, #, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0, #, 1]");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (byte) 10, '#', 100.0d, "", 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 10, #, 100.0, , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 10, #, 100.0, , 0.0]");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 13, 1, obj4, 100L, objArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass4, 1.0f, (byte) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class [Ljava.lang.Object;, 1.0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class [Ljava.lang.Object;, 1.0, 1, -1]");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1.0d), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 0.0f, (-1.0d), 100.0f, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 0.0, -1.0, 100.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 0.0, -1.0, 100.0, a]");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 10.0d, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10.0, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10.0, class [Ljava.lang.Object;]");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 100, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100, 13]");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1L), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100,  ]");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) true, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray10 = new java.lang.Object[] { scriptable3, '#', 100, 100.0d, 1L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, #, 100, 100.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, #, 100, 100.0, 1, 0.0]");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 0.0]");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 1, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1, 4]");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 10]");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 8, 'a', 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[8, a, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[8, a, 0, -1]");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100.0d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) scriptable2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0, objArray4, 10.0d, 10.0d, (-1.0f), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, [], 10.0, 10.0, -1.0, -1]");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 4, 13, wildcardClass5, obj6, 1.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), (-1L), wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, -1, class com.google.javascript.rhino.head.UniqueTag]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, -1, class com.google.javascript.rhino.head.UniqueTag]");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 2, 10L, 1, wildcardClass6, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[2, 10, 1, class com.google.javascript.rhino.head.UniqueTag, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[2, 10, 1, class com.google.javascript.rhino.head.UniqueTag, a]");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 10, '4', (byte) 10, scriptable6, 1L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 4, 10, null, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 4, 10, null, 1, 100.0]");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (short) 1, obj5, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 2, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[2, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[2, 1.0]");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1), wildcardClass4, 1L, 100L, obj7, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { false, obj4, 10, (byte) -1, 'a', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0f), 4, 10L, obj6, 1.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (-1), (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 8, true, 1, obj6, objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', 100.0d, 8, scriptable6, (short) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, 100.0, 8, null, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[#, 100.0, 8, null, 1, -1]");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1.0]");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (short) -1, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, class [Ljava.lang.Object;]");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', objArray4, true, (byte) 0, 4, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[#, [], true, 0, 4, 0]");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, (byte) 1, (short) 0, (-1.0f), 10L, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 1, 0, -1.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 1, 0, -1.0, 10, 4]");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10.0f, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1, 'a', false, 2, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, a, false, 2, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, a, false, 2, 1, 1]");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 4, 10L, 'a', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 4, 10, a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 4, 10, a, 0]");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 1, '#', 10, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 4]");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, #]");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) true, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 10L, 100.0f, 100.0f, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 0.0]");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) 100, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), (short) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1, 0]");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 0L, (short) 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 0, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 0, 0, 10.0]");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0f, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, (short) 1, 100, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1, 100, -1.0]");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 4, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 4, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 4, 100.0]");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 4, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 4, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 4, -1, 10]");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, (short) 10, (byte) 1, false, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10, 1, false,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10, 1, false,  ]");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 13, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[13, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[13, -1]");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 10, true, (-1.0f), 100L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 10, true, -1.0, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 10, true, -1.0, 100, 100.0]");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, #]");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, '#', (byte) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, #, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, #, 10, a]");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) -1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { ' ', (short) -1, obj5, 0L, (short) 1, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (short) 1, (-1.0d), (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 1, -1.0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 1, -1.0, 100, -1]");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), 0.0d, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 0.0, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 0.0, 2]");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) -1, 0, wildcardClass7, 0, obj9, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, class java.lang.Object]");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1L), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 8, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 8, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 8, 10]");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', "hi!", '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , hi!, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , hi!, #, 0]");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray10 = new java.lang.Object[] { objArray4, obj6, (byte) 100, obj9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray7 = new java.lang.Object[] { scriptable2, 100.0d, (short) 100, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null, 100.0, 100, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null, 100.0, 100, 2]");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 13, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), obj3, (byte) -1, (byte) 10, (short) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), 2, 100, scriptable5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 2, 100, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 2, 100, null]");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 0, "", 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0, , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0, , 0]");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 10, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, "", 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, , 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, , 1.0]");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { false, (short) 1, 10.0d, 10.0d, wildcardClass8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[false, 1, 10.0, 10.0, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[false, 1, 10.0, 10.0, class [Ljava.lang.Object;]");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, 100.0f, "hi!", objArray6, true, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 100.0, hi!, [], true, 100.0]");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 1.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 1.0, 100]");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0f, 8, 10L, (byte) 100, 1L, obj8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, 1.0f, (byte) -1, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1.0, -1, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1.0, -1, 2]");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 13, (byte) 0, 100L, '4', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[13, 0, 100, 4, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[13, 0, 100, 4, -1.0]");
    }
}

