import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 4, '#', ' ', (byte) 0, scriptable7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, #,  , 0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, #,  , 0, null]");
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, hi!]");
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 1.0d, (short) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 1.0, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 1.0, 1, 10]");
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1,  ]");
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, (-1.0d), wildcardClass6, 100, '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, -1.0, class [Ljava.lang.Object;, 100, #, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0, -1.0, class [Ljava.lang.Object;, 100, #, 1]");
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 10.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 10.0, 10]");
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (byte) 100, 8, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100, 8, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100, 8, 100.0]");
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, 2, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 2, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 2, 0]");
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 1, (-1.0f), false, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 1, -1.0, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 1, -1.0, false, -1]");
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1L, 10.0d, objArray6, 0.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1, 10.0, [], 0.0, 0]");
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (byte) 0, (-1.0d), obj5, '#', 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, obj3, 4, (-1.0f), 0L, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 10]");
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', 1.0f, obj5, 4, (byte) 1, 10.0d };
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
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (-1.0d), (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 100]");
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 13, (-1L), 1.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 13, -1, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 13, -1, 1.0, 1]");
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 13, 0.0d, 100L, "", (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[13, 0.0, 100, , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[13, 0.0, 100, , 10]");
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 8, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[8, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[8, 100.0]");
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 4]");
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 0.0d, 0.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass5, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class [Ljava.lang.Object;, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class [Ljava.lang.Object;, 2]");
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 1.0d, 10.0d, "hi!", 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 1.0, 10.0, hi!, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 1.0, 10.0, hi!, 4]");
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, scriptable3, (-1L), (short) 1 };
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
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, null, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, null, -1, 1]");
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (short) -1, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, -1]");
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 10, #]");
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 2, (short) 0, objArray6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[2, 0, []]");
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 13, objArray5, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 13, [], 13]");
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 100.0f, 100, 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 100.0, 100, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 100.0, 100, 100, 0.0]");
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, "", (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, , 0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, , 0,  ]");
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 100, (short) 0, false, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 100, 0, false, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 100, 0, false, class java.lang.Object]");
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 4]");
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (-1L), false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, -1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, -1, false]");
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (short) 10, 1L, obj5, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { objArray4, obj5, 10.0f, 0L, obj9, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.putProperty(scriptable0, 100, (java.lang.Object) scriptable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, (-1L), 4, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1, 4, 100]");
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 100.0f, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 1]");
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, false, false };
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
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 1.0f, wildcardClass5 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, 1.0, class com.google.javascript.rhino.head.UniqueTag]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, 1.0, class com.google.javascript.rhino.head.UniqueTag]");
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, (-1), "", (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, -1, , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, -1, , 0]");
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, wildcardClass4, 10, objArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, class java.lang.Object, 10, []]");
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 0.0d, 1, 0.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0.0, 1, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0.0, 1, 0.0, -1]");
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 0L, ' ', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 0,  , 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 0,  , 1.0]");
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, scriptable3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, null]");
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, 'a', 10.0f, obj6 };
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
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, 1.0d, 100, (-1), 10.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1.0, 100, -1, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1.0, 100, -1, 10.0, 100.0]");
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, (short) 100, (byte) 100, (-1.0f), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 100, 100, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 100, 100, -1.0, -1]");
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1, 10]");
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, true, (short) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, true, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, true, 1, -1]");
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { obj3, obj4, 10.0d, 8, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 100.0f, (byte) 0, (byte) 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, 1L, objArray5, "", 1L, (byte) 100 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 1, [], , 1, 100]");
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, 1.0d, (byte) 1, (short) -1, 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 1.0, 1, -1, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 1.0, 1, -1, 10, -1.0]");
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 100.0f, (-1.0d), 2, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100.0, -1.0, 2, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100.0, -1.0, 2, 0.0]");
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0L, (byte) 1, 8, (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 0, 1, 8, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 0, 1, 8, -1, 0.0]");
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 100.0f, obj4, (short) 0, 1L, '#' };
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
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 100L, 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 100, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 100, 10, 100]");
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, (byte) -1, obj5, "", (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (-1.0d), (-1), wildcardClass7, 13, wildcardClass10 };
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0, -1, class [Ljava.lang.Object;, 13, class com.google.javascript.rhino.head.UniqueTag]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0, -1, class [Ljava.lang.Object;, 13, class com.google.javascript.rhino.head.UniqueTag]");
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, false]");
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', "hi!", (byte) 1, objArray6, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, hi!, 1, [], 1]");
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, (byte) 10, wildcardClass7, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 10, class [Ljava.lang.Object;, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 10, class [Ljava.lang.Object;, 0]");
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (short) 10, wildcardClass6, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10, class [Ljava.lang.Object;, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 10, class [Ljava.lang.Object;, 8]");
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj8 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { wildcardClass4, 1, 1, 10.0f, obj8, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 8, obj4, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 1.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 1.0, -1]");
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, objArray4, obj6, 0.0d, (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
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
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 0.0d, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0.0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0.0, 8]");
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 2]");
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 2, 10, (-1.0f), wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[2, 10, -1.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[2, 10, -1.0, class java.lang.Object]");
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 10, 8, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, 8, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, 8, 10.0]");
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), obj3, (-1.0f), false, 1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 2, 8, obj4, objArray6, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , -1]");
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , ]");
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (byte) 100, 100.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100, 100.0, 100]");
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10, 10]");
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, wildcardClass6, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 0.0d, 10.0d, (-1.0d), scriptable5, objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0, 10.0, -1.0, null, []]");
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8589");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), obj4, 13, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8590");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8591");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', 10, 1.0f, 0.0f, "hi!", wildcardClass9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, 10, 1.0, 0.0, hi!, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, 10, 1.0, 0.0, hi!, class [Ljava.lang.Object;]");
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8592");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', (-1.0f), (short) 100, 100.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , -1.0, 100, 100.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , -1.0, 100, 100.0, 4]");
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8593");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, wildcardClass5, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, class com.google.javascript.rhino.head.UniqueTag, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, class com.google.javascript.rhino.head.UniqueTag, 1]");
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8594");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 2, 1, (byte) -1, (byte) -1, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[2, 1, -1, -1, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[2, 1, -1, -1, 13]");
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8595");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray9 = new java.lang.Object[] { scriptable2, (short) -1, (short) 0, 1L, 1.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null, -1, 0, 1, 1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null, -1, 0, 1, 1.0, 1.0]");
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8596");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1, 0]");
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8597");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, true, (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, true, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, true, 10, 100]");
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8598");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1), scriptable4, obj6, false, 13, 1 };
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
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8599");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8600");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 4, 100, '4', obj6, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8601");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1.0]");
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8602");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 4, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 100]");
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8603");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, obj3, (-1), (byte) 100, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8604");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), obj4, wildcardClass8, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8605");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 1.0d, 8, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 1.0, 8, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 1.0, 8, 0]");
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8606");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, (short) 100, 1.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class java.lang.Object, 100, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class java.lang.Object, 100, 1.0, 10]");
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8607");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 10, 100.0]");
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8608");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass4, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object,  ]");
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8609");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 10, wildcardClass5, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 10, class com.google.javascript.rhino.head.UniqueTag, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 10, class com.google.javascript.rhino.head.UniqueTag, -1.0]");
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8610");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 100L, 0.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 100, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 100, 0.0, 10.0]");
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8611");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass4, 100.0d, obj6, 100.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8612");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, obj4, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8613");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass5, (short) 1, '#', obj8 };
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
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8614");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, wildcardClass6 };
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, class [Ljava.lang.Object;]");
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8615");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0f, (-1.0f), objArray5, true, '4', obj8 };
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
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8616");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '#', (-1.0f), 100, 1L, '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[#, -1.0, 100, 1, #, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[#, -1.0, 100, 1, #, 10]");
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8617");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0]");
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8618");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 13, (short) 10, true, (byte) 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[13, 10, true, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[13, 10, true, 10, 4]");
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8619");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, '4', 100, (byte) 0, '#', "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class com.google.javascript.rhino.head.UniqueTag, 4, 100, 0, #, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class com.google.javascript.rhino.head.UniqueTag, 4, 100, 0, #, ]");
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8620");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 8, (short) 100, 10L, (short) 100, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[8, 100, 10, 100, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[8, 100, 10, 100, true]");
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8621");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 4]");
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8622");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 0]");
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8623");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, 10.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10.0, 0.0]");
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8624");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 8, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[8, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[8, 10]");
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8625");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8626");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 2, 10L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 2, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 2, 10, -1]");
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8627");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 10L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10, -1]");
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8628");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, -1]");
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8629");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable9 = null;
        java.lang.Object[] objArray10 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable9);
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1.0f, obj3, (short) -1, obj6, 8, objArray10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8630");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 1L, (-1.0d), 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, -1.0, 1]");
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8631");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 100.0f, (-1.0f), (short) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100.0, -1.0, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100.0, -1.0, 0, #]");
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8632");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) objArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test8633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8633");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8634");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (short) 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 1, -1.0]");
    }

    @Test
    public void test8635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8635");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), (-1.0d), 'a', obj5, 1.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8636");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (-1), (-1.0f), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, -1, -1.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, -1, -1.0, a]");
    }

    @Test
    public void test8637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8637");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8638");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, 8]");
    }

    @Test
    public void test8639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8639");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 100.0]");
    }

    @Test
    public void test8640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8640");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, (short) -1, obj5 };
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
    public void test8641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8641");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8642");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 0, (short) 100, 2, 0.0f, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8643");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10]");
    }

    @Test
    public void test8644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8644");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, (byte) 10, (byte) -1, (byte) 0, 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, 10, -1, 0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, 10, -1, 0, 1, 1]");
    }

    @Test
    public void test8645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8645");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray10 = new java.lang.Object[] { true, obj4, (-1L), 100.0f, '4', obj9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8646");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, (short) 100, (byte) 10, 0, 1L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100, 10, 0, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100, 10, 0, 1, 10]");
    }

    @Test
    public void test8647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8647");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 13, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[13, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[13, 100.0]");
    }

    @Test
    public void test8648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8648");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 4, 100.0f, 13, false, obj7, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8649");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, "hi!", 13, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8650");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test8651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8651");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', 2, false, 8, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , 2, false, 8, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , 2, false, 8, 0]");
    }

    @Test
    public void test8652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8652");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 'a', '4', (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, a, 4, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, a, 4, 10,  ]");
    }

    @Test
    public void test8653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8653");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 2, 0, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[2, 0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[2, 0, ]");
    }

    @Test
    public void test8654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8654");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) -1, 1.0f, "hi!", 'a', true, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 1.0, hi!, a, true, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 1.0, hi!, a, true, 10.0]");
    }

    @Test
    public void test8655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8655");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, 10L, (byte) -1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 10, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 10, -1, 0]");
    }

    @Test
    public void test8656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8656");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 1.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 1.0, 1.0]");
    }

    @Test
    public void test8657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8657");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, -1, 100]");
    }

    @Test
    public void test8658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8658");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, true, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, true, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, true, hi!]");
    }

    @Test
    public void test8659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8659");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj3, (short) 0, true, obj6, (byte) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8660");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8661");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1L), 1, 100, 10L, 100, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 1, 100, 10, 100, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 1, 100, 10, 100, 13]");
    }

    @Test
    public void test8662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8662");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 0, (short) 0, 10.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 0, 0, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 0, 0, 10.0, -1]");
    }

    @Test
    public void test8663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8663");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, "hi!", 1L, true, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, hi!, 1, true, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, hi!, 1, true, -1, 0]");
    }

    @Test
    public void test8664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8664");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', 10L, 100L, obj6, 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8665");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 10.0d, 1.0f, obj5, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }
}

