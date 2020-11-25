import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray2 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) scriptable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100.0f, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 4, 100]");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) wildcardClass4);
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray2 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable1);
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0.0]");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, 0);
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, obj3, obj5, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0f), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
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
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 1.0f, (short) 10, wildcardClass6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 1.0, 10, class com.google.javascript.rhino.head.UniqueTag]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 1.0, 10, class com.google.javascript.rhino.head.UniqueTag]");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) "", 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '4', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, (-1.0d), 10.0d, (byte) 100, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (byte) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 10.0]");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, wildcardClass6, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, class [Ljava.lang.Object;, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, class [Ljava.lang.Object;, 100]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 8]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (-1.0d), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, -1.0, 1]");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, obj3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 8]");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10]");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 100.0f, scriptable4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 100.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 100.0, null]");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) -1, objArray5, 0, "hi!", 1.0d, obj9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, obj3, 1.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, 10, (-1L), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, -1, -1]");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) wildcardClass4);
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) scriptable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1]");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 100, '#', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100, #, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100, #, 0.0]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, objArray5, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, [], 1]");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj1 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1 };
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (byte) 10, scriptable5, 100 };
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
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10, null, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 10, null, 100]");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass4, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (short) 100, (-1), 'a', "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 100, -1, a, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 100, -1, a, hi!]");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 13]");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) scriptable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, obj4, 1, 2, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, true]");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, "", 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, , a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, , a]");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 8, obj4, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[class com.google.javascript.rhino.head.UniqueTag, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[class com.google.javascript.rhino.head.UniqueTag, 1]");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) objArray3);
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 0L, (byte) 0, 1.0d, 10L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 0, 0, 1.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 0, 0, 1.0, 10, 4]");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (-1), (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { objArray4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[]]");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 8, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (-1), (java.lang.Object) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 13]");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, objArray4, (byte) 0, 0.0f, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, [], 0, 0.0, 4]");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (short) 1, (-1), 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 1, -1, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 1, -1, 13]");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray3, wildcardClass6, obj7, false, 1, '4' };
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0f, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj1 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass4);
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (byte) -1, "hi!", 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1, hi!, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1, hi!, 1, 10]");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, 8);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1]");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), (byte) 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 10, 0.0]");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0]");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), obj4, false, (-1L), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10L, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0, "hi!", obj5, ' ', (byte) 1 };
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 2, (byte) 100, 8, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[2, 100, 8, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[2, 100, 8, 0]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 10L, 10L, 8, 'a', false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, 100.0d, true, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 100.0, true, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 100.0, true, a]");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray4, 10L, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.rhino.head.ScriptableObject.hasProperty(scriptable0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) scriptable2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 10]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 8, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 4, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0L, (byte) 1, objArray5, (byte) 10, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 1, [], 10, 1, 10]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 4]");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100]");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L };
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 1L, (short) 1, 100L, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 1, 1, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 1, 1, 100, false]");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 100.0d, 0, 100.0f, ' ', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100.0, 0, 100.0,  , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100.0, 0, 100.0,  , 0.0]");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 4, 4, ' ', 1.0f, "", obj8 };
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (byte) 1, (byte) 10, 1.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 1, 10, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 1, 10, 1.0, 10]");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0]");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, (-1.0d), 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, -1.0, 100]");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 13, 100L, 8, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 13, 100, 8, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 13, 100, 8, -1]");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 4, 10.0d, (byte) 0, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 10.0, 0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 10.0, 0, class java.lang.Object]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, wildcardClass4, 4, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, class com.google.javascript.rhino.head.UniqueTag, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, class com.google.javascript.rhino.head.UniqueTag, 4, 100]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, '#', (-1.0f), "", obj7 };
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 8, 1, 'a', 13, (short) 0 };
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1.0f), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { scriptable2, wildcardClass5, "hi!" };
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null, class java.lang.Object, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null, class java.lang.Object, hi!]");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 0.0]");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (-1), (short) 100, '#', 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1, 100, #, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1, 100, #, 100]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) wildcardClass4);
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) -1, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100.0f, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0d, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 1]");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0d, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 2, 10.0f, scriptable4, scriptable6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[2, 10.0, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[2, 10.0, null, null]");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (byte) 1, (byte) 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1, 0, 10.0]");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0f, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray2 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1]");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 2, obj4, (byte) 1 };
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
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, (-1), (short) 1, (short) 0, (short) 100, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, -1, 1, 0, 100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, -1, 1, 0, 100, hi!]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0, objArray5, (byte) 1, 0L, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, [], 1, 0, true]");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, false, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, false, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, false, -1.0]");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) -1, obj4, 0, objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass4, "hi!", (byte) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class com.google.javascript.rhino.head.UniqueTag, hi!, 0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class com.google.javascript.rhino.head.UniqueTag, hi!, 0, 1.0]");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 13, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[13, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[13, -1, 10]");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = com.google.javascript.rhino.head.ScriptableObject.getTopScopeValue(scriptable0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, true, 0.0f, 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, true, 0.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, true, 0.0, 100, 1]");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) ' ', obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 0, (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, class [Ljava.lang.Object;]");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 13, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) -1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[2]");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, (short) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 10, 1]");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '#', (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 100.0f, 1.0d, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100.0, 1.0, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100.0, 1.0, 0, 10]");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1, (short) 0, (-1.0d), (byte) 0, 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0, -1.0, 0, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0, -1.0, 0, 10, -1]");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, obj4, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, '#', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, #, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, #, -1.0]");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 100, 1, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 8, ' ', obj5, objArray8, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 2, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', (byte) -1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, -1, -1.0]");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0L, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 1L, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0d, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, "", 1, obj5, 10.0d };
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
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass4, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class [Ljava.lang.Object;, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class [Ljava.lang.Object;, a]");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, 10L };
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, 0.0f, (short) 10, (byte) 10, wildcardClass8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 0.0, 10, 10, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 0.0, 10, 10, class [Ljava.lang.Object;]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { ' ', scriptable3, 1.0f, (byte) 1, 10.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[ , null, 1.0, 1, 10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[ , null, 1.0, 1, 10.0, -1.0]");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 10, (byte) 10, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 10, 10, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 10, 10, -1, 0]");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 10, (java.lang.Object) objArray3);
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 2, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[2, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[2, 8]");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (-1), 1.0d, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, -1, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, -1, 1.0, 4]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, "", wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, , class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, , class java.lang.Object]");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) objArray3);
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (short) 100, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0f, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0d, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) objArray3);
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 'a', 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, a, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, a, 10, 1.0]");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0f), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 8, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0f, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 2, true, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[2, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[2, true, 1]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0d, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 1, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1 };
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 8, 100L, 2, obj7 };
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1.0]");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, 4, (byte) 10, false, 13, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 4, 10, false, 13, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 4, 10, false, 13, 0]");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, (-1L), (byte) -1, (-1.0d), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, -1, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, -1, -1.0, 10]");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) '4', (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 8, objArray5, scriptable7, (short) 0, obj10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1.0d), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0f, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 10.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, scriptable3, 1L, 10L, obj7, (byte) 100 };
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, 0.0d, objArray5, 13, 0L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 0.0, [], 13, 0, 100]");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) 'a', (java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 10, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, 0.0d, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, 0.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, 0.0, 100, 1]");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) scriptable2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, 10, 0.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10, 0.0, 10.0]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "hi!", obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass4);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, (int) (byte) 100, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), "hi!", '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, hi!, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, hi!, #]");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putConstProperty(scriptable0, "", (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

