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

    @Test
    public void test8666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8666");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { objArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[]]");
    }

    @Test
    public void test8667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8667");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 10.0f, 1L, true, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 10.0, 1, true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 10.0, 1, true, 0.0]");
    }

    @Test
    public void test8668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8668");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , 0.0]");
    }

    @Test
    public void test8669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8669");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 10, (short) 100, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8670");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, true };
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
    public void test8671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8671");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 4, 1L, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 1, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 1, 2]");
    }

    @Test
    public void test8672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8672");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, wildcardClass4, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, class com.google.javascript.rhino.head.UniqueTag, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, class com.google.javascript.rhino.head.UniqueTag, 10]");
    }

    @Test
    public void test8673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8673");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, objArray5, 10L };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, [], 10]");
    }

    @Test
    public void test8674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8674");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray3, (-1L), 1.0d };
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
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], -1, 1.0]");
    }

    @Test
    public void test8675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8675");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8676");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0,  , 100.0]");
    }

    @Test
    public void test8677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8677");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test8678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8678");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (byte) 1, (byte) 1, (short) 1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 1, 1, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 1, 1, 1, 100.0]");
    }

    @Test
    public void test8679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8679");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 4, 1, obj5, 100L };
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
    public void test8680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8680");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, "hi!", 1L, 0, (-1.0d), 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, hi!, 1, 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, hi!, 1, 0, -1.0, 100]");
    }

    @Test
    public void test8681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8681");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test8682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8682");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (byte) 0, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0, false]");
    }

    @Test
    public void test8683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8683");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, 10.0f, 1L, (short) 100, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class com.google.javascript.rhino.head.UniqueTag, 10.0, 1, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class com.google.javascript.rhino.head.UniqueTag, 10.0, 1, 100, false]");
    }

    @Test
    public void test8684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8684");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray10 = new java.lang.Object[] { scriptable3, 10.0d, (short) 10, (byte) 10, ' ', obj9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8685");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 8, 10, (short) 100, "", '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[8, 10, 100, , #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[8, 10, 100, , #]");
    }

    @Test
    public void test8686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8686");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, objArray4 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, []]");
    }

    @Test
    public void test8687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8687");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, -1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, -1,  ]");
    }

    @Test
    public void test8688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8688");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8689");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 13]");
    }

    @Test
    public void test8690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8690");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 100L };
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
    public void test8691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8691");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, '4', (byte) 0, (-1.0f), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 4, 0, -1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 4, 0, -1.0, 1.0]");
    }

    @Test
    public void test8692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8692");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass4, (-1), 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class java.lang.Object, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class java.lang.Object, -1, 0]");
    }

    @Test
    public void test8693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8693");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1, 100.0f, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 1, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 1, 100.0, hi!]");
    }

    @Test
    public void test8694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8694");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, '#', 100.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, #, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, #, 100.0, 100]");
    }

    @Test
    public void test8695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8695");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, (byte) 0, (-1L), (short) 0, (short) 0, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8696");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8697");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 4, 0L, obj5, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8698");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (-1.0f), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8699");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", (byte) 10, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[hi!, 10, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[hi!, 10, 1, 100]");
    }

    @Test
    public void test8700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8700");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, true, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, true, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, true, 0]");
    }

    @Test
    public void test8701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8701");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 13, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 13, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 13, 1]");
    }

    @Test
    public void test8702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8702");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10.0d, (short) 1, 0L, scriptable6, 4, (short) 100 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0, 1, 0, null, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0, 1, 0, null, 4, 100]");
    }

    @Test
    public void test8703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8703");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 100.0f, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8704");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, true]");
    }

    @Test
    public void test8705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8705");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10.0f, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8706");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, obj3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test8707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8707");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 4, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, true]");
    }

    @Test
    public void test8708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8708");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, (short) 0, (byte) -1, (byte) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0, -1, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0, -1, 100, 10]");
    }

    @Test
    public void test8709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8709");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d), 10.0f, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 10.0, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 10.0, 10, #]");
    }

    @Test
    public void test8710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8710");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { scriptable3, (-1L), 10.0d, 0.0f, 10 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null, -1, 10.0, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null, -1, 10.0, 0.0, 10]");
    }

    @Test
    public void test8711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8711");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 100.0d, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8712");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 8, 1.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 8, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 8, 1.0, 1]");
    }

    @Test
    public void test8713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8713");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#', 100, obj4, objArray7, 13, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8714");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj3, 4, 100L, 1.0d, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8715");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 4]");
    }

    @Test
    public void test8716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8716");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0f, 10.0f, (-1L), obj6, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8717");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), (short) 10, obj4 };
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
    }

    @Test
    public void test8718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8718");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, obj3, wildcardClass6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8719");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, obj3, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8720");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 2, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[2, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[2, false]");
    }

    @Test
    public void test8721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8721");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 2, (short) -1, obj5, true, 10, obj8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8722");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, 8, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100, 8, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100, 8, 4]");
    }

    @Test
    public void test8723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8723");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (byte) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, -1]");
    }

    @Test
    public void test8724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8724");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, hi!]");
    }

    @Test
    public void test8725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8725");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 10.0f, (byte) 1, true, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 10.0, 1, true, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 10.0, 1, true, 0]");
    }

    @Test
    public void test8726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8726");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 0.0f, 4, false, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0.0, 4, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0.0, 4, false, 0]");
    }

    @Test
    public void test8727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8727");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", 1.0d, (-1), 0.0f, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[hi!, 1.0, -1, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[hi!, 1.0, -1, 0.0, -1]");
    }

    @Test
    public void test8728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8728");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8729");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, objArray5, 0 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, [], 0]");
    }

    @Test
    public void test8730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8730");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 100, a]");
    }

    @Test
    public void test8731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8731");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 2]");
    }

    @Test
    public void test8732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8732");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, -1.0]");
    }

    @Test
    public void test8733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8733");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, ' ', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1,  , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1,  , 100]");
    }

    @Test
    public void test8734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8734");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, obj3, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8735");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8736");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, '#', (short) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, #, 100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, #, 100, 10.0]");
    }

    @Test
    public void test8737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8737");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) -1, ' ', 0L, wildcardClass7, (short) 1, (-1.0f) };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1,  , 0, class com.google.javascript.rhino.head.UniqueTag, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1,  , 0, class com.google.javascript.rhino.head.UniqueTag, 1, -1.0]");
    }

    @Test
    public void test8738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8738");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 13, (short) 100, 1.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[13, 100, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[13, 100, 1.0, 4]");
    }

    @Test
    public void test8739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8739");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8740");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, 0L, "", 10, wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, , 10, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, , 10, class java.lang.Object]");
    }

    @Test
    public void test8741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8741");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass4, (int) (short) 1);
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
    public void test8742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8742");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (-1.0f), (-1.0f), (byte) 100, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1.0, -1.0, 100, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1.0, -1.0, 100, 13]");
    }

    @Test
    public void test8743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8743");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) "hi!", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8744");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 1, objArray5, 1, 1.0d, 1L, 1 };
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
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1, [], 1, 1.0, 1, 1]");
    }

    @Test
    public void test8745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8745");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable8 = null;
        java.lang.Object[] objArray9 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable8);
        java.lang.Object[] objArray11 = new java.lang.Object[] { 0.0f, 4, "", wildcardClass7, objArray9, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0, 4, , class java.lang.Object, [], 100]");
    }

    @Test
    public void test8746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8746");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (short) 100, 0L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 100, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 100, 0, -1]");
    }

    @Test
    public void test8747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8747");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 10.0d, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 10.0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 10.0, 0, -1]");
    }

    @Test
    public void test8748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8748");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 1, 0.0f, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 1, 0.0, a, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 1, 0.0, a, 1]");
    }

    @Test
    public void test8749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8749");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, 1, 4, (-1.0f), scriptable7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 1, 4, -1.0, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 1, 4, -1.0, null]");
    }

    @Test
    public void test8750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8750");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, "hi!", '#', '#', (byte) 0, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class com.google.javascript.rhino.head.UniqueTag, hi!, #, #, 0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class com.google.javascript.rhino.head.UniqueTag, hi!, #, #, 0, 4]");
    }

    @Test
    public void test8751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8751");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 10, scriptable5, 0L };
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
    }

    @Test
    public void test8752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8752");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 1.0d, (short) 10, objArray6, (short) 10, 10.0f, obj10 };
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test8753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8753");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, "hi!", (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, hi!, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, hi!, -1, 0]");
    }

    @Test
    public void test8754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8754");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, 2, 13, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 2, 13, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 2, 13, hi!]");
    }

    @Test
    public void test8755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8755");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, "hi!", false, 4, (byte) -1, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[true, hi!, false, 4, -1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[true, hi!, false, 4, -1, false]");
    }

    @Test
    public void test8756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8756");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", (short) 100, 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[hi!, 100, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[hi!, 100, 10, 100]");
    }

    @Test
    public void test8757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8757");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8758");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { scriptable2, 0.0f, 8 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null, 0.0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null, 0.0, 8]");
    }

    @Test
    public void test8759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8759");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { scriptable3, obj5, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8760");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, 1]");
    }

    @Test
    public void test8761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8761");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, 100.0d, (-1.0f), (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 100.0, -1.0, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 100.0, -1.0, -1, 0.0]");
    }

    @Test
    public void test8762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8762");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, obj3, obj4, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8763");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 0.0d, 10.0d, 0, (byte) 10, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0.0, 10.0, 0, 10, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0.0, 10.0, 0, 10, 8]");
    }

    @Test
    public void test8764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8764");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, wildcardClass6, 100.0f };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, class [Ljava.lang.Object;, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, class [Ljava.lang.Object;, 100.0]");
    }

    @Test
    public void test8765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8765");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 13, 'a', false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[13, a, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[13, a, false]");
    }

    @Test
    public void test8766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8766");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object obj8 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) -1, obj4, (byte) -1, scriptable6, obj8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8767");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj2, "hi!", obj5, 4, 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8768");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 1, obj5, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8769");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 1.0f, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8770");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, '#', 2, obj6, 10.0d };
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
    public void test8771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8771");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0.0f, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8772");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 0L, false, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 0, false, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 0, false, 1]");
    }

    @Test
    public void test8773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8773");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj2, 4, 2, 10L, ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8774");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { objArray4, (short) 10, (-1.0d), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 10, -1.0, 100.0]");
    }

    @Test
    public void test8775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8775");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 0, 100]");
    }

    @Test
    public void test8776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8776");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 10L, (byte) 0, obj5, 1.0d, 10L };
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
    public void test8777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8777");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, obj4, (byte) 100, 2, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8778");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, "", 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, , 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, , 2]");
    }

    @Test
    public void test8779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8779");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 1]");
    }

    @Test
    public void test8780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8780");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0]");
    }

    @Test
    public void test8781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8781");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, ]");
    }

    @Test
    public void test8782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8782");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (-1), true, (-1L), 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, -1, true, -1, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, -1, true, -1, 13]");
    }

    @Test
    public void test8783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8783");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 4, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, ]");
    }

    @Test
    public void test8784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8784");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 100L, 0L, 10L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 100, 0, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 100, 0, 10, a]");
    }

    @Test
    public void test8785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8785");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 100, "", wildcardClass7, '4', obj9 };
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
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8786");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 100, "hi!", 10, 1.0d, 1.0f, "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, hi!, 10, 1.0, 1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, hi!, 10, 1.0, 1.0, ]");
    }

    @Test
    public void test8787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8787");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100.0]");
    }

    @Test
    public void test8788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8788");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 4]");
    }

    @Test
    public void test8789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8789");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (short) 100, '4', 1.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 100, 4, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 100, 4, 1.0, 100]");
    }

    @Test
    public void test8790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8790");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0f, (-1L), 10, false, (byte) 10, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8791");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 1, 8, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8792");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, 1]");
    }

    @Test
    public void test8793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8793");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, (-1), (byte) 0, 1L, 100.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, -1, 0, 1, 100.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, -1, 0, 1, 100.0, #]");
    }

    @Test
    public void test8794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8794");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 1.0d, 100.0f, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 1.0, 100.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 1.0, 100.0, 100, 100]");
    }

    @Test
    public void test8795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8795");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 10, "hi!", 10L, objArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10, hi!, 10, []]");
    }

    @Test
    public void test8796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8796");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 10.0d, 1.0f, 'a', 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10.0, 1.0, a, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10.0, 1.0, a, 8]");
    }

    @Test
    public void test8797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8797");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, -1.0]");
    }

    @Test
    public void test8798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8798");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 100.0d, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 100.0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 100.0, 8]");
    }

    @Test
    public void test8799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8799");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, '#', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, #, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, #, -1.0]");
    }

    @Test
    public void test8800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8800");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", obj2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8801");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, -1]");
    }

    @Test
    public void test8802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8802");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (short) 1, "hi!", (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1, hi!, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1, hi!, 10]");
    }

    @Test
    public void test8803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8803");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0f, (-1L), 2, 4, obj7, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8804");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, -1]");
    }

    @Test
    public void test8805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8805");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 0, scriptable5, 2 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, null, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, null, 2]");
    }

    @Test
    public void test8806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8806");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) objArray3, (int) (byte) -1);
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
    public void test8807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8807");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', 1, wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 1, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 1, class java.lang.Object]");
    }

    @Test
    public void test8808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8808");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 0]");
    }

    @Test
    public void test8809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8809");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj3, "hi!", 100 };
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
    public void test8810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8810");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1), 100.0d, objArray6, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1, 100.0, [], 100]");
    }

    @Test
    public void test8811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8811");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8812");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, 10L, (short) 0, 100.0f, "hi!", '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, 10, 0, 100.0, hi!, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, 10, 0, 100.0, hi!, 4]");
    }

    @Test
    public void test8813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8813");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 0.0d, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8814");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray4, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8815");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, objArray5, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, [], 0, 1]");
    }

    @Test
    public void test8816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8816");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, 'a', "", (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[true, a, , 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[true, a, , 100, 10]");
    }

    @Test
    public void test8817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8817");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 10, 10.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 10.0, -1]");
    }

    @Test
    public void test8818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8818");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, "", 10, 1L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, , 10, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, , 10, 1, 10]");
    }

    @Test
    public void test8819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8819");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (-1.0f) };
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
    public void test8820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8820");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", obj2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8821");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 0L, ' ', (-1.0f), obj6, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8822");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (short) 1, "hi!", obj5, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8823");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1, (byte) 10, false, 10, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 10, false, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 10, false, 10, 10, -1]");
    }

    @Test
    public void test8824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8824");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0]");
    }

    @Test
    public void test8825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8825");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", (byte) 10, obj5, (byte) 10 };
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
    public void test8826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8826");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, (byte) 10, 100.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 10, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 10, 100.0, 0]");
    }

    @Test
    public void test8827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8827");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (-1L), '4', (byte) 100, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8828");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, 0L, ' ', obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8829");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10, objArray5, (byte) 0, (byte) 100, "hi!" };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, [], 0, 100, hi!]");
    }

    @Test
    public void test8830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8830");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, 0L, (short) 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 0, 0, 1]");
    }

    @Test
    public void test8831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8831");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100L, wildcardClass6, objArray8, true, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray12);
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
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100, class [Ljava.lang.Object;, [], true, 2]");
    }

    @Test
    public void test8832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8832");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 1L, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 1, #, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 1, #, -1]");
    }

    @Test
    public void test8833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8833");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0,  , 0]");
    }

    @Test
    public void test8834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8834");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, -1]");
    }

    @Test
    public void test8835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8835");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 0L, 2, '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 0, 2, #, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 0, 2, #, -1]");
    }

    @Test
    public void test8836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8836");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1L, (-1L), obj5, ' ', (byte) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8837");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', false, 0.0f, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, false, 0.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, false, 0.0, true]");
    }

    @Test
    public void test8838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8838");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0d, wildcardClass4, true, 0.0f, objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0, class com.google.javascript.rhino.head.UniqueTag, true, 0.0, []]");
    }

    @Test
    public void test8839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8839");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0, 1L, (short) 0, obj6, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8840");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, 8, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 8, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 8, 100]");
    }

    @Test
    public void test8841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8841");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 8, 1.0d, true, 1, "hi!", 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[8, 1.0, true, 1, hi!, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[8, 1.0, true, 1, hi!, 8]");
    }

    @Test
    public void test8842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8842");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', "", 8, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, , 8, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, , 8, 0]");
    }

    @Test
    public void test8843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8843");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 4, 100L, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 4, 100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 4, 100, hi!]");
    }

    @Test
    public void test8844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8844");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, "hi!", 10.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, hi!, 10.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, hi!, 10.0, 4]");
    }

    @Test
    public void test8845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8845");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 0L, 100.0d, (short) -1, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0, 100.0, -1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0, 100.0, -1, false]");
    }

    @Test
    public void test8846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8846");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), (short) 0, objArray6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 0, []]");
    }

    @Test
    public void test8847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8847");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, true, obj5, (byte) 0, 0L, (short) 0 };
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
    public void test8848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8848");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", wildcardClass5, 4 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, class com.google.javascript.rhino.head.UniqueTag, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, class com.google.javascript.rhino.head.UniqueTag, 4]");
    }

    @Test
    public void test8849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8849");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 10L, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 4]");
    }

    @Test
    public void test8850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8850");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, '4', 13, 1.0d, (-1.0d), (short) -1 };
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
    public void test8851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8851");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 8, true, (short) 0, (byte) 100, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[8, true, 0, 100, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[8, true, 0, 100, 8]");
    }

    @Test
    public void test8852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8852");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, obj3, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8853");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 1, '#', 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 1, #, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 1, #, 8]");
    }

    @Test
    public void test8854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8854");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { scriptable3, 100L, 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null, 100, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null, 100, 10, 10.0]");
    }

    @Test
    public void test8855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8855");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8856");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { ' ', (short) 0, wildcardClass6, 10, '4', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[ , 0, class com.google.javascript.rhino.head.UniqueTag, 10, 4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[ , 0, class com.google.javascript.rhino.head.UniqueTag, 10, 4, 10.0]");
    }

    @Test
    public void test8857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8857");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 8, (short) 0, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[8, 0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[8, 0, 8]");
    }

    @Test
    public void test8858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8858");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray4, obj5, 100.0d, "" };
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8859");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 1.0]");
    }

    @Test
    public void test8860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8860");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { "hi!", 0.0f, obj4, obj6, obj7, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8861");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 10.0, -1]");
    }

    @Test
    public void test8862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8862");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 'a', obj4, 10.0d, (-1) };
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
    public void test8863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8863");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, 10, obj5, 1L, (-1), obj9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8864");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj8 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) -1, wildcardClass4, 4, 100.0d, (short) 100, wildcardClass9 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, class java.lang.Object, 4, 100.0, 100, class com.google.javascript.rhino.head.UniqueTag]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, class java.lang.Object, 4, 100.0, 100, class com.google.javascript.rhino.head.UniqueTag]");
    }

    @Test
    public void test8865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8865");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { wildcardClass4, 'a', (short) -1, 100.0f, (short) 0, '#' };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[class com.google.javascript.rhino.head.UniqueTag, a, -1, 100.0, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[class com.google.javascript.rhino.head.UniqueTag, a, -1, 100.0, 0, #]");
    }

    @Test
    public void test8866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8866");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (short) 100, (byte) -1, (-1.0d), obj6, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8867");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', wildcardClass5, '4', 13, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[a, class [Ljava.lang.Object;, 4, 13, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[a, class [Ljava.lang.Object;, 4, 13, -1]");
    }

    @Test
    public void test8868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8868");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), 10.0d, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10.0, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10.0, 13]");
    }

    @Test
    public void test8869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8869");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 2, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 2, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 2, 10.0]");
    }

    @Test
    public void test8870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8870");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 2, (-1L), (short) 10, (-1.0f), 100L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[2, -1, 10, -1.0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[2, -1, 10, -1.0, 100, 10]");
    }

    @Test
    public void test8871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8871");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { scriptable2, obj4, true, 100.0f };
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
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8872");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, ' ', 10L, 1.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true,  , 10, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true,  , 10, 1.0, 10]");
    }

    @Test
    public void test8873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8873");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 8, "", (short) 100, (short) 0, (-1.0f), "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[8, , 100, 0, -1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[8, , 100, 0, -1.0, hi!]");
    }

    @Test
    public void test8874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8874");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, a]");
    }

    @Test
    public void test8875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8875");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, '4', (short) 1, 2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 4, 1, 2]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 4, 1, 2]");
    }

    @Test
    public void test8876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8876");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 13, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8877");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0d, obj4, "", 0L, true, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8878");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100.0f, (-1.0d), (-1), 1, objArray8, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0, -1.0, -1, 1, [], 8]");
    }

    @Test
    public void test8879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8879");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, (byte) 100, scriptable4, scriptable6, 10 };
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
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 100, null, null, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 100, null, null, 10]");
    }

    @Test
    public void test8880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8880");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) wildcardClass3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test8881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8881");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 2, (byte) -1, 100, 10L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[2, -1, 100, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[2, -1, 100, 10, 0.0]");
    }

    @Test
    public void test8882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8882");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, ' ', (byte) 10, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1,  , 10, -1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1,  , 10, -1, #]");
    }

    @Test
    public void test8883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8883");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, -1]");
    }

    @Test
    public void test8884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8884");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (byte) 1, (byte) 100, 8, 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 1, 100, 8, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 1, 100, 8, 10, 1]");
    }

    @Test
    public void test8885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8885");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (-1), 0, 8, 10.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, -1, 0, 8, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, -1, 0, 8, 10.0, 1]");
    }

    @Test
    public void test8886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8886");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', false, "", obj6, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8887");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', '4', 0.0d, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 4, 0.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 4, 0.0, hi!]");
    }

    @Test
    public void test8888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8888");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, 8, 10L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8889");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 10, 1.0]");
    }

    @Test
    public void test8890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8890");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj9 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 1.0f, 10, wildcardClass7, obj8, obj9 };
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
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8891");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8892");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass4, true, 1L, 100.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class [Ljava.lang.Object;, true, 1, 100.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class [Ljava.lang.Object;, true, 1, 100.0, 100.0]");
    }

    @Test
    public void test8893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8893");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 2, 8, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 2, 8, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 2, 8, -1, 100]");
    }

    @Test
    public void test8894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8894");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, (byte) 100, obj4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test8895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8895");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), 1.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 1.0, 100.0]");
    }

    @Test
    public void test8896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8896");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, -1, 10]");
    }

    @Test
    public void test8897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8897");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, (short) 0, (-1.0f), true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 0, -1.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 0, -1.0, true]");
    }

    @Test
    public void test8898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8898");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, 0.0d, (byte) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 0.0, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 0.0, 10, 10]");
    }

    @Test
    public void test8899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8899");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, '4', (short) 1, 1.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 4, 1, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 4, 1, 1.0, -1]");
    }

    @Test
    public void test8900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8900");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, 100L, "", 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 100, , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 100, , 0]");
    }

    @Test
    public void test8901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8901");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 100.0]");
    }

    @Test
    public void test8902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8902");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 10]");
    }

    @Test
    public void test8903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8903");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj3, (byte) 1, (byte) -1, 1, 2 };
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
    public void test8904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8904");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray9 = new java.lang.Object[] { scriptable2, (byte) 1, 4, 1.0f, 1, 1L };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null, 1, 4, 1.0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null, 1, 4, 1.0, 1, 1]");
    }

    @Test
    public void test8905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8905");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 13, wildcardClass4, 100, (byte) 1, obj7, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8906");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, 'a' };
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
    public void test8907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8907");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 'a', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, a, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, a, 10.0]");
    }

    @Test
    public void test8908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8908");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (-1L), 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 0]");
    }

    @Test
    public void test8909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8909");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 8, (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[8, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[8, -1, 10]");
    }

    @Test
    public void test8910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8910");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (byte) 100, (short) 0, 1.0d, (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 100, 0, 1.0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 100, 0, 1.0, -1, 1]");
    }

    @Test
    public void test8911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8911");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, 1L, "", 10, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 1, , 10, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 1, , 10, 8]");
    }

    @Test
    public void test8912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8912");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 10, 100L, wildcardClass6, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 10, 100, class java.lang.Object, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 10, 100, class java.lang.Object, 4]");
    }

    @Test
    public void test8913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8913");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10.0]");
    }

    @Test
    public void test8914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8914");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 13, (-1), (short) 10, '4', "hi!", 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[13, -1, 10, 4, hi!, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[13, -1, 10, 4, hi!, 1.0]");
    }

    @Test
    public void test8915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8915");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', "", 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, , 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, , 10.0]");
    }

    @Test
    public void test8916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8916");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 13, (-1.0f), (byte) 100, (-1), '4', false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[13, -1.0, 100, -1, 4, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[13, -1.0, 100, -1, 4, false]");
    }

    @Test
    public void test8917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8917");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        com.google.javascript.rhino.head.Scriptable scriptable5 = null;
        java.lang.Object[] objArray6 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable5);
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] { wildcardClass4, wildcardClass7, (short) 100, 100, 13, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[class java.lang.Object, class [Ljava.lang.Object;, 100, 100, 13, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[class java.lang.Object, class [Ljava.lang.Object;, 100, 100, 13, 1]");
    }

    @Test
    public void test8918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8918");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, true]");
    }

    @Test
    public void test8919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8919");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray4, 1.0d, (byte) -1, 100L, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], 1.0, -1, 100, true]");
    }

    @Test
    public void test8920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8920");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable7 = null;
        java.lang.Object[] objArray8 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable7);
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { false, 0.0f, 8, obj6, wildcardClass9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test8921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8921");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, obj3, (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8922");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, (byte) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, -1, 10]");
    }

    @Test
    public void test8923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8923");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, (-1L), (short) -1, 0.0f, 100.0f, 1 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class com.google.javascript.rhino.head.UniqueTag, -1, -1, 0.0, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class com.google.javascript.rhino.head.UniqueTag, -1, -1, 0.0, 100.0, 1]");
    }

    @Test
    public void test8924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8924");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (short) -1, (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 100, 0]");
    }

    @Test
    public void test8925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8925");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object[] objArray7 = new java.lang.Object[] { objArray3, 100L, (-1L), '#' };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 100, -1, #]");
    }

    @Test
    public void test8926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8926");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, 1, 100.0d, 1L, obj7 };
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
    public void test8927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8927");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, obj3, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test8928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8928");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Object obj6 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { scriptable2, (-1.0d), 10L, obj6, 1L };
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
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8929");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), (byte) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 100, 10.0]");
    }

    @Test
    public void test8930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8930");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 13, "", 0L, (-1L), objArray7, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[13, , 0, -1, [],  ]");
    }

    @Test
    public void test8931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8931");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test8932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8932");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d), (byte) -1, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, -1, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, -1, -1, 0]");
    }

    @Test
    public void test8933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8933");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), (-1.0d), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, -1.0, 100.0]");
    }

    @Test
    public void test8934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8934");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0d, 'a', 1.0d, 1, 'a', true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0, a, 1.0, 1, a, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0, a, 1.0, 1, a, true]");
    }

    @Test
    public void test8935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8935");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, scriptable4, (short) 0, obj7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8936");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 100.0f, 100.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 100.0, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 100.0, 100.0, 100]");
    }

    @Test
    public void test8937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8937");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) scriptable2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test8938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8938");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 'a', '4', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, a, 4, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, a, 4, 0.0]");
    }

    @Test
    public void test8939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8939");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj2 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, "", 100.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8940");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray6 = new java.lang.Object[] { 13, scriptable3, (-1.0d) };
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
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[13, null, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[13, null, -1.0]");
    }

    @Test
    public void test8941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8941");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8942");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 100L, (-1.0d), obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8943");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, 10.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10.0, 100]");
    }

    @Test
    public void test8944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8944");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 1.0d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, 1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, 1.0, 10.0]");
    }

    @Test
    public void test8945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8945");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8946");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { ' ', 13, 0L, (byte) 1, "hi!", 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[ , 13, 0, 1, hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[ , 13, 0, 1, hi!, 100.0]");
    }

    @Test
    public void test8947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8947");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray9 = new java.lang.Object[] { objArray4, 100L, (-1L), 10L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], 100, -1, 10, a]");
    }

    @Test
    public void test8948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8948");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), scriptable4, obj6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8949");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8950");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, (byte) 10, (byte) 1, 13 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 10, 1, 13]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 10, 1, 13]");
    }

    @Test
    public void test8951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8951");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 13, (byte) 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 13, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 13, 0, -1]");
    }

    @Test
    public void test8952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8952");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 13, 10L, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[13, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[13, 10, -1.0]");
    }

    @Test
    public void test8953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8953");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        com.google.javascript.rhino.head.Scriptable scriptable6 = null;
        java.lang.Object[] objArray7 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable6);
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { "", 'a', obj4, '#', wildcardClass8 };
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
    public void test8954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8954");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (short) 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1, 10.0]");
    }

    @Test
    public void test8955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8955");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 1]");
    }

    @Test
    public void test8956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8956");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 0L, 1.0f, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8957");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, '4', 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 4, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 4, 8]");
    }

    @Test
    public void test8958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8958");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 0, obj5, (short) 0 };
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
    public void test8959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8959");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 'a', 0.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, a, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, a, 0.0, 1]");
    }

    @Test
    public void test8960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8960");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 0L, 8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 0, 8]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 0, 8]");
    }

    @Test
    public void test8961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8961");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 2, 10.0f, 100L, 2, 1.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[2, 10.0, 100, 2, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[2, 10.0, 100, 2, 1.0, -1.0]");
    }

    @Test
    public void test8962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8962");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, 2, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 2, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 2, hi!]");
    }

    @Test
    public void test8963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8963");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 100L, 1L, 100.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100, 1, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100, 1, 100.0, 0]");
    }

    @Test
    public void test8964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8964");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 1.0f, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 1.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 1.0,  ]");
    }

    @Test
    public void test8965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8965");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, (byte) 0, obj4, (byte) 0, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test8966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8966");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, obj3, wildcardClass6, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test8967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8967");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 2, (-1), wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[2, -1, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[2, -1, class java.lang.Object]");
    }

    @Test
    public void test8968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8968");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d), (byte) 1, 100.0f, 10.0d, 10.0d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 1, 100.0, 10.0, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 1, 100.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test8969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8969");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Object[] objArray6 = new java.lang.Object[] { scriptable3, false };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null, false]");
    }

    @Test
    public void test8970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8970");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test8971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8971");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, 10, 100.0]");
    }

    @Test
    public void test8972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8972");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, (short) -1, wildcardClass6 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, class [Ljava.lang.Object;]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, class [Ljava.lang.Object;]");
    }

    @Test
    public void test8973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8973");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 100, 100]");
    }

    @Test
    public void test8974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8974");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, 10.0d, 100.0f, (-1.0d), 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 10.0, 100.0, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 10.0, 100.0, -1.0, 10]");
    }

    @Test
    public void test8975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8975");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, -1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, -1, 4]");
    }

    @Test
    public void test8976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8976");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (short) 1, 2, (-1.0d), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 1, 2, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 1, 2, -1.0, 10]");
    }

    @Test
    public void test8977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8977");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 4, false };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 4, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 4, false]");
    }

    @Test
    public void test8978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8978");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj4 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object obj5 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (-1L), obj4, obj5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test8979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8979");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable3 = null;
        java.lang.Object[] objArray4 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable3);
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { objArray4, 10.0f, (short) 10, 10, (short) 0 };
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
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[[], 10.0, 10, 10, 0]");
    }

    @Test
    public void test8980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8980");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, 1.0]");
    }

    @Test
    public void test8981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8981");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "hi!", (java.lang.Object) scriptable2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test8982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8982");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable2 = null;
        java.lang.Object[] objArray3 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable2);
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ScriptableObject.defineProperty(scriptable0, "", (java.lang.Object) wildcardClass4, (int) (short) 1);
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
    public void test8983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8983");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 0.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0.0, 10]");
    }

    @Test
    public void test8984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8984");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, obj3, 13, (short) -1, 4, (short) 1 };
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
    public void test8985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8985");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, (short) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100, -1]");
    }

    @Test
    public void test8986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8986");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1,  ]");
    }

    @Test
    public void test8987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8987");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 2, false, "", 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 2, false, , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 2, false, , 10]");
    }

    @Test
    public void test8988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8988");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 2, 1L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 2, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 2, 1]");
    }

    @Test
    public void test8989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8989");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, obj3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test8990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8990");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj3, "hi!", 13, 1L, true };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8991");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, 0, objArray5 };
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
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, 0, []]");
    }

    @Test
    public void test8992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8992");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), ' ', (byte) 0, 10L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0,  , 0, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0,  , 0, 10, 100.0]");
    }

    @Test
    public void test8993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8993");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '#', 1L, 10.0f, false, 100, 4 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[#, 1, 10.0, false, 100, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[#, 1, 10.0, false, 100, 4]");
    }

    @Test
    public void test8994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8994");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10.0f, scriptable4, (short) -1, ' ', ' ', (-1.0f) };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0, null, -1,  ,  , -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0, null, -1,  ,  , -1.0]");
    }

    @Test
    public void test8995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8995");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, (short) 100, false, obj5, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test8996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8996");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        com.google.javascript.rhino.head.Scriptable scriptable4 = null;
        java.lang.Object[] objArray5 = com.google.javascript.rhino.head.ScriptableObject.getPropertyIds(scriptable4);
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, wildcardClass6, '#' };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, class [Ljava.lang.Object;, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, class [Ljava.lang.Object;, #]");
    }

    @Test
    public void test8997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8997");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 10.0d, true, (short) 0, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 10.0, true, 0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 10.0, true, 0, 1, 1]");
    }

    @Test
    public void test8998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8998");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', obj3, 13, '4' };
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
    public void test8999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8999");
        com.google.javascript.rhino.head.Scriptable scriptable0 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 8, 2, 0L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.callMethod(scriptable0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[8, 2, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[8, 2, 0]");
    }

    @Test
    public void test9000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test9000");
        com.google.javascript.rhino.head.Context context0 = null;
        com.google.javascript.rhino.head.Scriptable scriptable1 = null;
        java.lang.Object obj7 = com.google.javascript.rhino.head.Scriptable.NOT_FOUND;
        java.lang.Object[] objArray9 = new java.lang.Object[] { true, (-1.0f), 1.0d, (byte) 1, obj7, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = com.google.javascript.rhino.head.ScriptableObject.callMethod(context0, scriptable1, "", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(objArray9);
    }
}

