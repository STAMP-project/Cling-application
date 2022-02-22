import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: " + "'", str3, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) mathException2);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: " + "'", str5, "java.io.IOException: ");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Class<?> wildcardClass3 = derivativeException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        java.lang.Class<?> wildcardClass6 = mathException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray3);
        java.lang.Class<?> wildcardClass5 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray3);
        java.lang.Class<?> wildcardClass5 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass5 = mathException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass5 = mathException2.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        java.lang.String str6 = mathException2.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        mathException2.addSuppressed((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException9);
        mathException2.addSuppressed((java.lang.Throwable) mathException9);
        java.lang.Throwable throwable14 = null;
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: ", throwable14);
        // The following exception was thrown during execution in test generation
        try {
            mathException2.addSuppressed(throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        mathException3.addSuppressed((java.lang.Throwable) mathException6);
        java.io.IOException iOException8 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException8);
        java.lang.String str10 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: " + "'", str10, "java.io.IOException: ");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        java.lang.String str19 = mathException17.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str19, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.lang.String str5 = mathException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.String str4 = mathException1.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: " + "'", str4, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        java.lang.String str5 = derivativeException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str5, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        mathException6.addSuppressed((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException13);
        mathException6.addSuppressed((java.lang.Throwable) mathException13);
        mathException2.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        java.lang.String str19 = mathException18.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray6 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass13 = mathException12.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Class<?> wildcardClass2 = mathException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.Object[] objArray3 = mathException1.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str5 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String[] strArray4 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Class<?> wildcardClass7 = derivativeException6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.lang.String str4 = mathException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: " + "'", str4, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass6 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException3.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", objArray5, (java.lang.Throwable) iOException7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", objArray5, (java.lang.Throwable) mathException12);
        java.lang.Class<?> wildcardClass14 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) mathException1);
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: " + "'", str3, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", objArray17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        mathException22.addSuppressed((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray17, (java.lang.Throwable) mathException22);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        derivativeException10.addSuppressed((java.lang.Throwable) mathException28);
        java.lang.String str33 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str33, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) mathException3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException2.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray4, (java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass8 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.String str7 = mathException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        mathException3.addSuppressed((java.lang.Throwable) mathException6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) mathException3);
        java.lang.String str9 = mathException3.getPattern();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray9, throwable15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.Class<?> wildcardClass18 = derivativeException17.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        java.lang.String str8 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str8, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", objArray6, (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException14);
        java.lang.String str16 = mathException14.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: " + "'", str16, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        java.lang.Class<?> wildcardClass30 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray5 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.lang.String str7 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray6);
        java.lang.String str11 = mathException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str11, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        java.lang.String str19 = derivativeException18.getPattern();
        java.lang.Class<?> wildcardClass20 = derivativeException18.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.Object[] objArray3 = mathException1.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Class<?> wildcardClass5 = mathException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray12);
        java.lang.String str14 = mathException13.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.MathException: " + "'", str14, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray4, (java.lang.Throwable) derivativeException8);
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException8.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        java.lang.String str18 = mathException11.getPattern();
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException11);
        java.lang.Throwable throwable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException19.addSuppressed(throwable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        mathException3.addSuppressed((java.lang.Throwable) mathException6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) mathException3);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: hi!" + "'", str9, "java.io.IOException: hi!");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.lang.String str4 = mathException2.getPattern();
        java.lang.String str5 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) mathException8);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.lang.Class<?> wildcardClass13 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str3, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray7, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException14);
        java.lang.Class<?> wildcardClass17 = mathException14.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.apache.commons.math.MathException mathException0 = new org.apache.commons.math.MathException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.io.IOException iOException6 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        derivativeException1.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass13 = derivativeException1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.String str3 = derivativeException2.getPattern();
        java.lang.String str4 = derivativeException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str4, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        java.lang.Class<?> wildcardClass32 = derivativeException28.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass6 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str7, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException16);
        java.lang.Class<?> wildcardClass21 = mathException20.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray8, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray19 = mathException15.getSuppressed();
        java.lang.Class<?> wildcardClass20 = mathException15.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray6 = mathException2.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray11, throwable17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray11);
        java.lang.Class<?> wildcardClass22 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.lang.String str4 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: " + "'", str4, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        java.lang.String str13 = mathException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str13, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        mathException3.addSuppressed((java.lang.Throwable) mathException6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass9 = iOException8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("hi!", throwable1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: hi!" + "'", str4, "java.io.IOException: hi!");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.io.IOException iOException2 = new java.io.IOException(throwable0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass6 = mathException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", objArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.lang.String str8 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException8);
        java.lang.Class<?> wildcardClass10 = mathException8.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass5 = mathException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException7);
        java.io.IOException iOException10 = new java.io.IOException("hi!", (java.lang.Throwable) mathException9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) iOException10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.lang.String str14 = iOException12.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: " + "'", str14, "java.io.IOException: ");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException6);
        java.lang.String str8 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = mathException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.Throwable[] throwableArray1 = iOException0.getSuppressed();
        java.lang.String str2 = iOException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException" + "'", str2, "java.io.IOException");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: " + "'", str3, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Object[] objArray4 = mathException1.getArguments();
        java.lang.String str5 = mathException1.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray4);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        mathException8.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray4, (java.lang.Throwable) derivativeException13);
        java.lang.String str15 = mathException14.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass7 = mathException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException6.getPattern();
        java.lang.Class<?> wildcardClass8 = mathException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str7, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) mathException8);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.lang.String str13 = mathException12.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str13, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray6 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass13 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) mathException19);
        java.lang.String str21 = iOException20.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str21, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException24);
        iOException21.addSuppressed((java.lang.Throwable) mathException24);
        java.lang.String str28 = mathException24.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.MathException: " + "'", str28, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: hi!" + "'", str2, "java.io.IOException: hi!");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException9.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str13 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: " + "'", str11, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        java.lang.String str18 = mathException11.getPattern();
        java.lang.String str19 = mathException11.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException2.getArguments();
        java.lang.String str5 = mathException2.getPattern();
        java.lang.Throwable[] throwableArray6 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray6);
        java.lang.Class<?> wildcardClass8 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray23);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("");
        mathException28.addSuppressed((java.lang.Throwable) mathException31);
        java.io.IOException iOException33 = new java.io.IOException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray23, (java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        java.io.IOException iOException36 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) iOException36);
        java.lang.Object[] objArray38 = mathException37.getArguments();
        java.lang.String str39 = mathException37.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str39, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray7);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException13);
        java.lang.String str15 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str15, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) mathException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray6 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) throwableArray6);
        java.lang.String str8 = mathException7.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str8, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray5);
        java.lang.String str9 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.String str6 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: hi!");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str2, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = mathException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) iOException8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) iOException8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Object[] objArray4 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass5 = mathException1.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str3, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray7, (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray7);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: ");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        mathException9.addSuppressed((java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray17 = mathException16.getSuppressed();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException18);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Class<?> wildcardClass14 = iOException13.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass5 = mathException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        java.lang.Throwable[] throwableArray31 = mathException30.getSuppressed();
        java.lang.Class<?> wildcardClass32 = throwableArray31.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        java.lang.String str31 = mathException30.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.MathException: " + "'", str31, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str14, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException25);
        java.lang.String str29 = derivativeException25.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str29, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) mathException23);
        java.lang.Throwable[] throwableArray25 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) derivativeException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray25);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11, (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        java.lang.Throwable[] throwableArray35 = mathException34.getSuppressed();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("");
        java.lang.String str40 = mathException39.getPattern();
        java.lang.Object[] objArray41 = mathException39.getArguments();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException39);
        java.lang.Object[] objArray43 = mathException42.getArguments();
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("", objArray43);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) throwableArray35, (java.lang.Throwable) mathException44);
        java.lang.Throwable[] throwableArray46 = mathException44.getSuppressed();
        java.lang.String str47 = mathException44.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.apache.commons.math.MathException: " + "'", str47, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.String str3 = mathException2.getPattern();
        java.lang.Object[] objArray4 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException2);
        java.lang.String str6 = mathException5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str6, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray27);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("");
        mathException32.addSuppressed((java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException("", (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray27, (java.lang.Throwable) mathException32);
        iOException20.addSuppressed((java.lang.Throwable) mathException32);
        java.lang.Class<?> wildcardClass40 = iOException20.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray11 = derivativeException4.getArguments();
        java.lang.String str12 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException18);
        java.lang.String str20 = mathException19.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str20, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray10 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray14 = mathException13.getArguments();
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) derivativeException16);
        java.lang.Class<?> wildcardClass18 = mathException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) derivativeException25);
        java.lang.Class<?> wildcardClass27 = mathException26.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", objArray8);
        java.lang.Class<?> wildcardClass10 = mathException9.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) mathException8);
        java.lang.String str11 = iOException10.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str11, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ", throwable1);
        java.lang.String str3 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str3, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException2.getArguments();
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException9);
        java.lang.String str11 = mathException10.getPattern();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray21, (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException28);
        mathException10.addSuppressed((java.lang.Throwable) mathException28);
        java.lang.String str33 = mathException10.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.MathException: " + "'", str33, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        java.io.IOException iOException16 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException15);
        java.lang.String str17 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException9.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray3);
        java.lang.String str5 = mathException4.getPattern();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass10 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException6);
        java.lang.String str9 = iOException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str9, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray5, (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        mathException14.addSuppressed((java.lang.Throwable) mathException17);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray5, (java.lang.Throwable) iOException19);
        java.lang.String[] strArray26 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray26);
        java.lang.Throwable throwable30 = null;
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("java.io.IOException: ", throwable30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray26, throwable30);
        // The following exception was thrown during execution in test generation
        try {
            mathException20.addSuppressed(throwable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray7, (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray7);
        java.lang.Class<?> wildcardClass16 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray5, (java.lang.Throwable) mathException14);
        java.lang.String str17 = mathException14.getPattern();
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException14);
        java.lang.Class<?> wildcardClass19 = iOException18.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        derivativeException9.addSuppressed((java.lang.Throwable) mathException13);
        java.lang.String str18 = mathException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: " + "'", str18, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        java.lang.Object[] objArray20 = mathException16.getArguments();
        java.io.IOException iOException23 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException23);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException26.getSuppressed();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", objArray20, (java.lang.Throwable) iOException26);
        java.lang.String str29 = mathException28.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str29, "org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        java.lang.Throwable[] throwableArray31 = mathException30.getSuppressed();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("");
        mathException34.addSuppressed((java.lang.Throwable) mathException37);
        mathException30.addSuppressed((java.lang.Throwable) mathException37);
        java.lang.String str40 = mathException30.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.apache.commons.math.MathException: " + "'", str40, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass7 = iOException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        java.lang.Throwable[] throwableArray31 = mathException30.getSuppressed();
        java.lang.Class<?> wildcardClass32 = mathException30.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray1, (java.lang.Throwable) mathException10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.String str3 = mathException2.getPattern();
        java.lang.Object[] objArray4 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.io.IOException iOException6 = new java.io.IOException("hi!", (java.lang.Throwable) mathException2);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: hi!" + "'", str7, "java.io.IOException: hi!");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.lang.String str9 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str9, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        mathException4.addSuppressed((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray18 = mathException4.getSuppressed();
        java.lang.Class<?> wildcardClass19 = throwableArray18.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Class<?> wildcardClass7 = iOException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray7, (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass6 = mathException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray6);
        java.lang.Object[] objArray14 = derivativeException13.getArguments();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[org.apache.commons.math.MathException: , hi!]");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        java.io.IOException iOException21 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException23);
        java.lang.Class<?> wildcardClass25 = iOException24.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException16);
        java.lang.String[] strArray28 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray28);
        java.io.IOException iOException33 = new java.io.IOException("", (java.lang.Throwable) mathException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        iOException20.addSuppressed((java.lang.Throwable) iOException34);
        java.lang.String[] strArray43 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray43);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray43);
        java.io.IOException iOException48 = new java.io.IOException("", (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException47);
        java.lang.Throwable[] throwableArray50 = mathException49.getSuppressed();
        iOException20.addSuppressed((java.lang.Throwable) mathException49);
        java.lang.Class<?> wildcardClass52 = iOException20.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) derivativeException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException19);
        java.lang.Class<?> wildcardClass21 = mathException19.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str12, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.String str9 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) mathException8);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.lang.Class<?> wildcardClass13 = mathException12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str3 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.MathException: " + "'", str3, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        mathException4.addSuppressed((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Class<?> wildcardClass18 = mathException17.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException5);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str9, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException16);
        java.lang.Class<?> wildcardClass21 = mathException16.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException9);
        java.lang.String str12 = iOException9.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: " + "'", str12, "java.io.IOException: ");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass9 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray7 = mathException3.getArguments();
        java.lang.String str8 = mathException3.getPattern();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException3.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        mathException4.addSuppressed((java.lang.Throwable) mathException12);
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException12);
        java.lang.String str18 = mathException12.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: " + "'", str18, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException23);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException31);
        java.io.IOException iOException34 = new java.io.IOException("hi!", (java.lang.Throwable) mathException33);
        derivativeException23.addSuppressed((java.lang.Throwable) mathException33);
        java.lang.String str36 = derivativeException23.getPattern();
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException23);
        java.lang.Class<?> wildcardClass38 = derivativeException18.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.Class<?> wildcardClass2 = mathException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException31);
        java.lang.Throwable[] throwableArray33 = mathException31.getSuppressed();
        java.lang.String str34 = mathException31.getPattern();
        java.lang.String str35 = mathException31.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.MathException: " + "'", str35, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str5, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException2.getArguments();
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException9);
        java.lang.String str11 = mathException10.getPattern();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray21, (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException28);
        mathException10.addSuppressed((java.lang.Throwable) mathException28);
        java.lang.String str33 = mathException28.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str33, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException14);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray7);
        java.lang.String str13 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str13, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String str15 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        derivativeException9.addSuppressed((java.lang.Throwable) mathException13);
        java.lang.Throwable[] throwableArray18 = mathException13.getSuppressed();
        java.lang.String str19 = mathException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException2.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", objArray4, (java.lang.Throwable) iOException6);
        java.lang.String str8 = mathException7.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException7);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray5 = iOException2.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray4);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        java.lang.Object[] objArray15 = mathException14.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException22);
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray4, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        java.lang.Throwable throwable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException28.addSuppressed(throwable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        mathException4.addSuppressed((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException17);
        java.io.IOException iOException19 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException18);
        java.lang.Class<?> wildcardClass20 = mathException18.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        java.lang.String str18 = mathException11.getPattern();
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        java.lang.Class<?> wildcardClass21 = mathException11.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        java.lang.String str4 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str4, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) mathException7);
        java.lang.Class<?> wildcardClass10 = mathException9.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray28);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("");
        mathException33.addSuppressed((java.lang.Throwable) mathException36);
        java.io.IOException iOException38 = new java.io.IOException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray28, (java.lang.Throwable) mathException33);
        iOException21.addSuppressed((java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) mathException33);
        java.lang.Class<?> wildcardClass44 = iOException43.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass4 = mathException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.String str10 = iOException9.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str10, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[java.io.IOException: , hi!]");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.lang.Object[] objArray6 = mathException4.getArguments();
        java.lang.String str7 = mathException4.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        mathException5.addSuppressed((java.lang.Throwable) mathException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        java.lang.String[] strArray19 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray19);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray19, (java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray19);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) derivativeException26);
        java.lang.String[] strArray35 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray35);
        java.io.IOException iOException40 = new java.io.IOException("", (java.lang.Throwable) mathException39);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) mathException39);
        java.lang.Throwable[] throwableArray42 = mathException39.getSuppressed();
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException44);
        mathException39.addSuppressed((java.lang.Throwable) derivativeException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) mathException39);
        java.lang.String str48 = mathException39.toString();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str48, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.String str4 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.MathException: " + "'", str4, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) mathException23);
        java.lang.Throwable[] throwableArray25 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) derivativeException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray25);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11, (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        java.io.IOException iOException35 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) mathException34);
        java.lang.Class<?> wildcardClass36 = mathException34.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray28);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("");
        mathException33.addSuppressed((java.lang.Throwable) mathException36);
        java.io.IOException iOException38 = new java.io.IOException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray28, (java.lang.Throwable) mathException33);
        iOException21.addSuppressed((java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException33);
        java.lang.String str42 = mathException41.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException" + "'", str42, "org.apache.commons.math.MathException: java.io.IOException");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) derivativeException15);
        java.lang.Throwable[] throwableArray17 = derivativeException15.getSuppressed();
        java.lang.Class<?> wildcardClass18 = derivativeException15.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", objArray8);
        java.lang.Class<?> wildcardClass10 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String str9 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray11, throwable17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray27);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("");
        mathException32.addSuppressed((java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException("", (java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray27, (java.lang.Throwable) mathException32);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException39);
        java.lang.Object[] objArray41 = derivativeException39.getArguments();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray11, (java.lang.Throwable) derivativeException39);
        java.lang.Object[] objArray43 = derivativeException39.getArguments();
        java.lang.Class<?> wildcardClass44 = derivativeException39.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException");
        java.lang.String str2 = mathException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException" + "'", str2, "org.apache.commons.math.MathException: java.io.IOException");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray3);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        java.lang.Object[] objArray13 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", objArray13);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        mathException18.addSuppressed((java.lang.Throwable) mathException21);
        java.io.IOException iOException23 = new java.io.IOException("", (java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", objArray13, (java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException25);
        java.lang.String str27 = mathException25.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!");
        mathException25.addSuppressed((java.lang.Throwable) mathException29);
        mathException4.addSuppressed((java.lang.Throwable) mathException25);
        java.lang.Class<?> wildcardClass32 = mathException25.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str27, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException2.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str6, "java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.String[] strArray4 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) strArray4, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException19);
        mathException15.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.String str22 = mathException15.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str22, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Object[] objArray4 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        java.io.IOException iOException10 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        mathException18.addSuppressed((java.lang.Throwable) mathException21);
        java.lang.Object[] objArray23 = mathException18.getArguments();
        mathException15.addSuppressed((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException15);
        java.lang.String str26 = mathException25.getPattern();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException24);
        iOException21.addSuppressed((java.lang.Throwable) mathException24);
        java.lang.Class<?> wildcardClass28 = mathException24.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        mathException10.addSuppressed((java.lang.Throwable) mathException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) mathException10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray17 = derivativeException16.getSuppressed();
        mathException6.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.String str19 = mathException6.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.lang.String str10 = mathException9.getPattern();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str10, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        java.lang.String[] strArray15 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray15);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", objArray6, (java.lang.Throwable) iOException18);
        java.lang.String str20 = iOException18.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str20, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("hi!", (java.lang.Throwable) mathException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass8 = mathException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray7 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7);
        java.lang.Class<?> wildcardClass9 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray7, (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray7);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray5 = mathException3.getSuppressed();
        java.lang.Object[] objArray6 = mathException3.getArguments();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray12);
        java.io.IOException iOException22 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException21);
        java.lang.Object[] objArray23 = derivativeException21.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[java.io.IOException: , hi!]");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException12);
        java.lang.Class<?> wildcardClass15 = mathException14.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        java.lang.String str18 = mathException11.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: " + "'", str18, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) derivativeException4);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.String str3 = mathException2.getPattern();
        java.lang.Object[] objArray4 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        mathException2.addSuppressed((java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: org.apache.commons.math.MathException: ", throwable1);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            mathException11.addSuppressed(throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.lang.String[] strArray4 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str8 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        java.lang.String str28 = derivativeException25.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str28, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass7 = mathException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException27);
        java.lang.String str29 = mathException28.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str29, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray9 = mathException8.getArguments();
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException8);
        derivativeException5.addSuppressed((java.lang.Throwable) mathException8);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException6);
        java.lang.Class<?> wildcardClass12 = mathException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str3, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray9, throwable15);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", objArray17);
        java.lang.String str19 = mathException18.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str19, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray6);
        java.lang.Object[] objArray14 = derivativeException13.getArguments();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException13);
        java.lang.Class<?> wildcardClass16 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        mathException5.addSuppressed((java.lang.Throwable) mathException8);
        java.io.IOException iOException10 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray13);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) mathException14);
        java.lang.String str16 = mathException14.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.MathException: " + "'", str16, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass5 = mathException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray2 = mathException1.getArguments();
        java.lang.Class<?> wildcardClass3 = mathException1.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException16);
        java.lang.String[] strArray21 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray21);
        java.lang.Object[] objArray23 = derivativeException22.getArguments();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException22);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        derivativeException16.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException28 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException25);
        java.lang.String str29 = iOException28.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str29, "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException16);
        java.lang.Object[] objArray18 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", objArray18);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        mathException23.addSuppressed((java.lang.Throwable) mathException26);
        java.io.IOException iOException28 = new java.io.IOException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", objArray18, (java.lang.Throwable) mathException23);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException29);
        java.io.IOException iOException31 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException30);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException35);
        iOException32.addSuppressed((java.lang.Throwable) mathException35);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7, (java.lang.Throwable) iOException32);
        java.io.IOException iOException40 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) mathException39);
        java.lang.Throwable[] throwableArray41 = mathException39.getSuppressed();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray8);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, throwable14);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException15);
        java.lang.String str18 = derivativeException17.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str18, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        java.lang.String str6 = mathException5.getPattern();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.lang.Object[] objArray24 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray24);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("");
        mathException29.addSuppressed((java.lang.Throwable) mathException32);
        java.io.IOException iOException34 = new java.io.IOException("", (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray24, (java.lang.Throwable) mathException29);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) iOException37);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("");
        java.lang.String str42 = mathException41.getPattern();
        java.lang.Object[] objArray43 = mathException41.getArguments();
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException41);
        iOException37.addSuppressed((java.lang.Throwable) mathException44);
        java.io.IOException iOException46 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException44);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException44);
        java.lang.Class<?> wildcardClass48 = derivativeException47.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass6 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        mathException3.addSuppressed((java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8, (java.lang.Throwable) mathException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("");
        mathException27.addSuppressed((java.lang.Throwable) mathException30);
        java.io.IOException iOException32 = new java.io.IOException("", (java.lang.Throwable) mathException27);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException32);
        java.lang.Throwable[] throwableArray34 = derivativeException33.getSuppressed();
        java.lang.String[] strArray41 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray41);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException44);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray41, (java.lang.Throwable) derivativeException45);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray41);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray41);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) derivativeException48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        iOException22.addSuppressed((java.lang.Throwable) derivativeException48);
        java.lang.Class<?> wildcardClass52 = derivativeException48.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.String[] strArray4 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String str8 = derivativeException6.getPattern();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        java.lang.Throwable[] throwableArray2 = mathException1.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Class<?> wildcardClass4 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray4);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        java.lang.Object[] objArray15 = mathException14.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException22);
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray4, (java.lang.Throwable) mathException22);
        java.lang.String[] strArray34 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray34);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException37);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray34, (java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        mathException22.addSuppressed((java.lang.Throwable) derivativeException41);
        java.lang.String str43 = derivativeException41.getPattern();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray8);
        java.lang.Object[] objArray17 = mathException16.getArguments();
        java.lang.Throwable[] throwableArray18 = mathException16.getSuppressed();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) throwableArray18);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", objArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray14, (java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Class<?> wildcardClass22 = derivativeException20.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray11, throwable17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray11);
        java.lang.Throwable[] throwableArray22 = derivativeException21.getSuppressed();
        java.lang.Object[] objArray23 = derivativeException21.getArguments();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[java.io.IOException: , hi!]");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray5, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray22 = mathException20.getSuppressed();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", objArray5, (java.lang.Throwable) mathException20);
        java.lang.Object[] objArray24 = mathException23.getArguments();
        java.lang.String str25 = mathException23.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str25, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException16);
        java.lang.Throwable[] throwableArray21 = mathException16.getSuppressed();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.Object[] objArray3 = mathException1.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        java.lang.String str6 = mathException5.getPattern();
        mathException1.addSuppressed((java.lang.Throwable) mathException5);
        java.lang.Class<?> wildcardClass8 = mathException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.String str3 = mathException2.getPattern();
        java.lang.Object[] objArray4 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.io.IOException iOException6 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass7 = mathException2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray6);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", throwable10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray6, throwable10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.String str7 = mathException5.getPattern();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray8, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray20 = mathException15.getSuppressed();
        java.lang.String str21 = mathException15.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str21, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException5);
        java.lang.String str9 = derivativeException5.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException16);
        java.lang.Throwable[] throwableArray21 = iOException20.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("");
        mathException25.addSuppressed((java.lang.Throwable) mathException28);
        java.io.IOException iOException30 = new java.io.IOException("hi!", (java.lang.Throwable) mathException25);
        iOException20.addSuppressed((java.lang.Throwable) iOException30);
        java.lang.String str32 = iOException20.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str32, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray12);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) mathException24);
        java.lang.Throwable[] throwableArray26 = mathException24.getSuppressed();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) derivativeException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        java.io.IOException iOException36 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException36);
        java.lang.String str38 = iOException36.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.io.IOException: java.io.IOException: hi!" + "'", str38, "java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray8);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, throwable14);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray8);
        java.lang.String str18 = mathException17.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str18, "org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray6 = mathException5.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray9 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: ", objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException31);
        java.lang.Throwable[] throwableArray33 = mathException31.getSuppressed();
        java.lang.String str34 = mathException31.getPattern();
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException43);
        java.io.IOException iOException45 = new java.io.IOException("", (java.lang.Throwable) mathException43);
        derivativeException40.addSuppressed((java.lang.Throwable) iOException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException40);
        java.io.IOException iOException48 = new java.io.IOException((java.lang.Throwable) mathException47);
        mathException31.addSuppressed((java.lang.Throwable) mathException47);
        java.lang.Class<?> wildcardClass50 = mathException47.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", objArray19);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("");
        mathException24.addSuppressed((java.lang.Throwable) mathException27);
        java.io.IOException iOException29 = new java.io.IOException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray19, (java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException30);
        java.io.IOException iOException32 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray7, (java.lang.Throwable) iOException33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        java.lang.Class<?> wildcardClass36 = derivativeException35.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray12 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray12);
        java.lang.Class<?> wildcardClass14 = throwableArray12.getClass();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) mathException2);
        java.lang.String str5 = mathException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = mathException15.getArguments();
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) mathException15);
        java.lang.Class<?> wildcardClass19 = iOException18.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray7 = mathException6.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray10 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: ", objArray10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray10);
        java.lang.Class<?> wildcardClass14 = mathException13.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
        java.io.IOException iOException3 = new java.io.IOException("hi!", (java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass4 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) mathException5);
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", throwable11);
        // The following exception was thrown during execution in test generation
        try {
            iOException9.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.String str4 = mathException3.getPattern();
        java.lang.Object[] objArray5 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) mathException3);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass9 = iOException8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
        java.lang.String[] strArray10 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray10, (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray10);
        java.lang.Object[] objArray18 = derivativeException17.getArguments();
        iOException3.addSuppressed((java.lang.Throwable) derivativeException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException21 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass22 = iOException21.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String str22 = iOException21.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: " + "'", str22, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) mathException13);
        java.lang.Class<?> wildcardClass15 = mathException13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray10 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray12 = mathException11.getArguments();
        java.lang.String str13 = mathException11.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray8);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException13);
        java.lang.Class<?> wildcardClass15 = mathException13.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", objArray19);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("");
        mathException24.addSuppressed((java.lang.Throwable) mathException27);
        java.io.IOException iOException29 = new java.io.IOException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray19, (java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException30);
        java.io.IOException iOException32 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException36);
        iOException33.addSuppressed((java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8, (java.lang.Throwable) iOException33);
        java.io.IOException iOException41 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) mathException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException40);
        java.lang.Class<?> wildcardClass44 = mathException40.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", objArray19);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("");
        mathException24.addSuppressed((java.lang.Throwable) mathException27);
        java.io.IOException iOException29 = new java.io.IOException("", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", objArray19, (java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException30);
        java.io.IOException iOException32 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray7, (java.lang.Throwable) iOException33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException33);
        java.lang.String str36 = derivativeException35.getPattern();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str36, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) mathException6);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", objArray6, (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException14);
        java.lang.String str17 = mathException14.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: " + "'", str17, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray5, (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray5);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        java.lang.Object[] objArray13 = derivativeException11.getArguments();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[org.apache.commons.math.MathException: , hi!]");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", objArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray14, (java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str23 = derivativeException22.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str23, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        mathException10.addSuppressed((java.lang.Throwable) mathException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) mathException10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray17 = derivativeException16.getSuppressed();
        mathException6.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.String str19 = derivativeException16.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str19, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.String str3 = mathException2.getPattern();
        java.lang.Object[] objArray4 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass7 = mathException6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException6);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException3);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str8, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.String str15 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str15, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray8 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        java.io.IOException iOException14 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        mathException4.addSuppressed((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.String str18 = mathException4.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: " + "'", str18, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        java.lang.Object[] objArray11 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        mathException16.addSuppressed((java.lang.Throwable) mathException19);
        java.io.IOException iOException21 = new java.io.IOException("", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray11, (java.lang.Throwable) mathException16);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray4, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray4, (java.lang.Throwable) mathException26);
        java.lang.Class<?> wildcardClass29 = mathException28.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        java.lang.String[] strArray30 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray30);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray30);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException41);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) mathException42);
        java.lang.Throwable[] throwableArray44 = mathException42.getSuppressed();
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) derivativeException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray44);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray30, (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray55 = mathException54.getArguments();
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Object[]) strArray30, (java.lang.Throwable) mathException54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray30);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray10, (java.lang.Throwable) mathException58);
        java.lang.Class<?> wildcardClass60 = mathException58.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: ");
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.lang.String[] strArray12 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) derivativeException19);
        java.lang.Throwable[] throwableArray21 = derivativeException19.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray26 = mathException25.getSuppressed();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) mathException28);
        java.lang.Throwable[] throwableArray35 = mathException28.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray7);
        java.lang.String str20 = mathException19.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str20, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) mathException8);
        java.lang.Class<?> wildcardClass11 = iOException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) mathException11);
        java.lang.String str13 = mathException11.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.MathException: " + "'", str13, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) mathException6);
        java.lang.String str8 = mathException6.getPattern();
        java.lang.Object[] objArray9 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        java.lang.Object[] objArray15 = mathException13.getArguments();
        java.io.IOException iOException17 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray15, (java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException22);
        java.lang.String str24 = mathException23.getPattern();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray9, (java.lang.Throwable) mathException23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray1, (java.lang.Throwable) mathException25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.commons.math.MathException mathException0 = new org.apache.commons.math.MathException();
        java.lang.String str1 = mathException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons.math.MathException" + "'", str1, "org.apache.commons.math.MathException");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", throwable2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", throwable2);
        java.lang.Class<?> wildcardClass5 = mathException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.String str6 = mathException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: " + "'", str6, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException13);
        java.lang.Class<?> wildcardClass15 = mathException14.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        java.io.IOException iOException20 = new java.io.IOException();
        java.lang.Throwable[] throwableArray21 = iOException20.getSuppressed();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray8, (java.lang.Throwable) iOException20);
        java.io.IOException iOException23 = new java.io.IOException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException22);
        java.lang.Class<?> wildcardClass24 = iOException23.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.io.IOException iOException5 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException14);
        java.lang.Throwable[] throwableArray17 = mathException14.getSuppressed();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        mathException22.addSuppressed((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException("hi!", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray31 = mathException30.getArguments();
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", objArray31);
        java.lang.String str33 = mathException32.getPattern();
        mathException22.addSuppressed((java.lang.Throwable) mathException32);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) mathException22);
        java.lang.Object[] objArray36 = mathException22.getArguments();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException22);
        java.lang.String str38 = mathException22.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str33, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.MathException: " + "'", str38, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", objArray17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        mathException22.addSuppressed((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray17, (java.lang.Throwable) mathException22);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        java.io.IOException iOException30 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        iOException31.addSuppressed((java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray6, (java.lang.Throwable) iOException31);
        java.lang.String str39 = iOException31.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: " + "'", str39, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray19 = mathException17.getSuppressed();
        java.lang.Class<?> wildcardClass20 = mathException17.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        mathException2.addSuppressed((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException9);
        mathException2.addSuppressed((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        java.lang.Class<?> wildcardClass14 = mathException13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        java.lang.String str9 = mathException8.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.String str7 = mathException2.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException19.getArguments();
        java.io.IOException iOException22 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException19);
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        java.lang.String str24 = iOException22.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str24, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.lang.Class<?> wildcardClass6 = mathException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        mathException2.addSuppressed((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException9);
        mathException2.addSuppressed((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        java.lang.Object[] objArray14 = mathException9.getArguments();
        java.lang.String str15 = mathException9.toString();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray5);
        java.lang.Class<?> wildcardClass9 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray4);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        mathException8.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray4, (java.lang.Throwable) derivativeException13);
        java.lang.Class<?> wildcardClass15 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray9 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray5, (java.lang.Throwable) mathException14);
        java.lang.String str17 = mathException14.getPattern();
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException14);
        java.lang.Object[] objArray19 = mathException14.getArguments();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray8);
        java.lang.Object[] objArray16 = derivativeException15.getArguments();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray1, (java.lang.Throwable) derivativeException15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[org.apache.commons.math.MathException: , hi!]");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) derivativeException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) mathException21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        java.lang.String str24 = iOException22.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str24, "java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        mathException2.addSuppressed((java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = mathException2.getArguments();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.Class<?> wildcardClass7 = mathException6.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray9);
        java.lang.Class<?> wildcardClass17 = mathException16.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", objArray17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        mathException22.addSuppressed((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray17, (java.lang.Throwable) mathException22);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        derivativeException10.addSuppressed((java.lang.Throwable) mathException28);
        java.lang.String str33 = derivativeException10.getPattern();
        java.lang.String str34 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.MathException: " + "'", str33, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str34, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", objArray3);
        java.lang.String str5 = mathException4.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str5, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = mathException4.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray10 = mathException9.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray6, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray6);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException23);
        java.lang.Throwable[] throwableArray25 = mathException24.getSuppressed();
        mathException18.addSuppressed((java.lang.Throwable) mathException24);
        java.io.IOException iOException27 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) mathException24);
        java.lang.Object[] objArray28 = mathException24.getArguments();
        java.lang.String str29 = mathException24.getPattern();
        java.lang.String str30 = mathException24.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.MathException: " + "'", str29, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str30, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.lang.Object[] objArray24 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", objArray24);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("");
        mathException29.addSuppressed((java.lang.Throwable) mathException32);
        java.io.IOException iOException34 = new java.io.IOException("", (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", objArray24, (java.lang.Throwable) mathException29);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException35);
        java.io.IOException iOException37 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) iOException37);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("");
        java.lang.String str42 = mathException41.getPattern();
        java.lang.Object[] objArray43 = mathException41.getArguments();
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException41);
        iOException37.addSuppressed((java.lang.Throwable) mathException44);
        java.io.IOException iOException46 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException44);
        java.lang.String str47 = iOException46.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str47, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) mathException22);
        java.lang.Throwable[] throwableArray24 = mathException22.getSuppressed();
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) derivativeException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray24);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray10, (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray35 = mathException34.getArguments();
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) mathException34);
        java.io.IOException iOException38 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
        java.lang.String[] strArray45 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray45);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray45, (java.lang.Throwable) derivativeException49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray45);
        java.lang.Object[] objArray53 = derivativeException52.getArguments();
        iOException38.addSuppressed((java.lang.Throwable) derivativeException52);
        mathException34.addSuppressed((java.lang.Throwable) derivativeException52);
        java.lang.Class<?> wildcardClass56 = derivativeException52.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.lang.Class<?> wildcardClass6 = iOException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray8 = derivativeException5.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: ", objArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) mathException11);
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray6, (java.lang.Throwable) iOException14);
        java.lang.Class<?> wildcardClass18 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) derivativeException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException28);
        java.lang.Class<?> wildcardClass31 = derivativeException28.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        mathException6.addSuppressed((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException13);
        mathException6.addSuppressed((java.lang.Throwable) mathException13);
        mathException2.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.String str20 = mathException19.getPattern();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass5 = iOException4.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray28);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("");
        mathException33.addSuppressed((java.lang.Throwable) mathException36);
        java.io.IOException iOException38 = new java.io.IOException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", objArray28, (java.lang.Throwable) mathException33);
        iOException21.addSuppressed((java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException33);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) mathException33);
        java.lang.String str44 = iOException43.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str44, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray18);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray18, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray18);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException27);
        java.lang.Class<?> wildcardClass29 = derivativeException27.getClass();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray7 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException4);
        java.io.IOException iOException9 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException8);
        java.lang.Throwable[] throwableArray10 = mathException8.getSuppressed();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray16 = mathException15.getArguments();
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException15);
        java.lang.String str19 = mathException18.getPattern();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) mathException20);
        java.lang.String str23 = mathException20.getPattern();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: " + "'", str19, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) mathException19);
        java.lang.Throwable[] throwableArray21 = mathException19.getSuppressed();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException23);
        java.lang.Throwable[] throwableArray25 = mathException23.getSuppressed();
        java.lang.Class<?> wildcardClass26 = throwableArray25.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", throwable2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.Class<?> wildcardClass6 = iOException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str3, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray11);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray11);
        java.lang.String str21 = derivativeException20.getPattern();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str21, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray12);
        java.lang.Class<?> wildcardClass23 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException9);
        java.lang.String str12 = mathException11.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: " + "'", str12, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray9 = derivativeException8.getSuppressed();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        java.lang.String str7 = mathException6.getPattern();
        java.lang.Object[] objArray8 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray3, (java.lang.Throwable) mathException6);
        java.lang.String str12 = mathException6.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: " + "'", str12, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray8, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray19 = mathException15.getSuppressed();
        java.lang.Class<?> wildcardClass20 = throwableArray19.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = mathException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) iOException8);
        java.lang.String str10 = mathException9.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException12);
        java.lang.String str14 = mathException12.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.MathException: " + "'", str14, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray13);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray13, throwable19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray13);
        java.lang.Throwable[] throwableArray23 = mathException22.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException22);
        java.lang.String str26 = mathException25.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", objArray1, (java.lang.Throwable) mathException25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str26, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", objArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        mathException15.addSuppressed((java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", objArray10, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", objArray10);
        java.lang.Object[] objArray23 = mathException22.getArguments();
        java.lang.String[] strArray28 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray23, (java.lang.Throwable) derivativeException30);
        java.io.IOException iOException32 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException30);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray34 = mathException33.getArguments();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray14 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException16);
        mathException11.addSuppressed((java.lang.Throwable) derivativeException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        java.lang.String str20 = mathException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: " + "'", str20, "org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException8.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = mathException7.getSuppressed();
        java.lang.Object[] objArray9 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException", (java.lang.Throwable) mathException10);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        java.io.IOException iOException16 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException15);
        java.lang.String str17 = iOException16.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str17, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", objArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException6.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: " + "'", str9, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str6 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        java.lang.Class<?> wildcardClass19 = derivativeException18.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray14 = mathException11.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException16);
        mathException11.addSuppressed((java.lang.Throwable) derivativeException17);
        java.lang.Class<?> wildcardClass19 = mathException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) mathException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str12 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException11);
        derivativeException8.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.String str15 = derivativeException8.getPattern();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.lang.String str17 = mathException16.getPattern();
        java.lang.String str18 = mathException16.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: " + "'", str17, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str18, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException2.getArguments();
        java.lang.String str5 = mathException2.getPattern();
        java.lang.Throwable[] throwableArray6 = mathException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException12);
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException13.addSuppressed(throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) mathException4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", objArray1, (java.lang.Throwable) iOException7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", strArray6);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) mathException5);
        java.lang.String str10 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str10, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException2);
        java.lang.String str6 = mathException2.getPattern();
        java.lang.String str7 = mathException2.getPattern();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray10);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("");
        mathException20.addSuppressed((java.lang.Throwable) mathException23);
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) mathException20);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) iOException25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", objArray1, (java.lang.Throwable) iOException25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray5 = mathException4.getArguments();
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException4);
        java.lang.String str8 = mathException7.getPattern();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException7);
        java.io.IOException iOException11 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException: ");
        mathException9.addSuppressed((java.lang.Throwable) iOException11);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: " + "'", str8, "java.io.IOException: ");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.String str8 = derivativeException4.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        java.lang.String str15 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.String[] strArray13 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray13);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray13, throwable19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray13);
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) derivativeException24);
        java.lang.String str26 = iOException25.toString();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str26, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str5, "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        java.lang.String str5 = mathException4.getPattern();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException4);
        java.lang.Class<?> wildcardClass8 = mathException7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray23);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("");
        mathException28.addSuppressed((java.lang.Throwable) mathException31);
        java.io.IOException iOException33 = new java.io.IOException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", objArray23, (java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        java.io.IOException iOException36 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) iOException36);
        java.lang.Object[] objArray38 = mathException37.getArguments();
        java.lang.Object[] objArray39 = mathException37.getArguments();
        java.lang.Throwable[] throwableArray40 = mathException37.getSuppressed();
        java.lang.Class<?> wildcardClass41 = mathException37.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        java.lang.String[] strArray16 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray16);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", objArray7, (java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        java.lang.Throwable[] throwableArray24 = mathException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", objArray7, (java.lang.Throwable) mathException23);
        java.lang.Object[] objArray27 = mathException26.getArguments();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray8 = mathException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException10);
        iOException1.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.String str13 = iOException10.toString();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str13, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException16);
        java.lang.Class<?> wildcardClass21 = mathException16.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray7 = mathException3.getArguments();
        java.lang.String str8 = mathException3.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.MathException: " + "'", str8, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException");
        java.lang.Class<?> wildcardClass2 = mathException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = mathException3.getArguments();
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", objArray5, (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", objArray5);
        java.lang.String str17 = mathException16.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: " + "'", str17, "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ");
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        iOException1.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Class<?> wildcardClass8 = iOException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray4);
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray14);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) mathException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        derivativeException6.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.String str22 = derivativeException20.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str22, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = mathException4.getArguments();
        java.lang.Object[] objArray7 = mathException4.getArguments();
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray13, (java.lang.Throwable) derivativeException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray7, (java.lang.Throwable) derivativeException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", objArray7);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray31);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray31);
        java.lang.Throwable throwable37 = null;
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray31, throwable37);
        java.lang.Object[] objArray39 = mathException38.getArguments();
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", objArray39);
        java.lang.String[] strArray50 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray50);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray50);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray50);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray50);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray50);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException62);
        java.lang.Object[] objArray64 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("", objArray64);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("");
        mathException69.addSuppressed((java.lang.Throwable) mathException72);
        java.io.IOException iOException74 = new java.io.IOException("", (java.lang.Throwable) mathException69);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", objArray64, (java.lang.Throwable) mathException69);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException75);
        java.io.IOException iOException77 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException76);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray50, (java.lang.Throwable) iOException77);
        mathException40.addSuppressed((java.lang.Throwable) mathException78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: ", objArray7, (java.lang.Throwable) mathException40);
        java.lang.Object[] objArray81 = mathException80.getArguments();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", objArray8, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray19 = mathException15.getArguments();
        java.lang.Throwable[] throwableArray20 = mathException15.getSuppressed();
        java.lang.String str21 = mathException15.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str21, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException13);
        java.lang.Throwable[] throwableArray16 = mathException13.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) mathException13);
        java.lang.Class<?> wildcardClass18 = mathException17.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        java.lang.String str9 = mathException8.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: " + "'", str9, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray10 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray12 = mathException11.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException11);
        java.lang.Class<?> wildcardClass14 = mathException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.lang.String str10 = mathException9.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str10, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = derivativeException6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.Throwable[] throwableArray10 = mathException6.getSuppressed();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray14 = mathException13.getArguments();
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) derivativeException16);
        java.lang.String str18 = derivativeException16.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!" + "'", str18, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.String[] strArray12 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) mathException22);
        java.lang.Throwable[] throwableArray24 = mathException22.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException29);
        java.lang.String[] strArray38 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray38);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray38, (java.lang.Throwable) derivativeException42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray38);
        java.io.IOException iOException46 = new java.io.IOException((java.lang.Throwable) derivativeException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray12);
        java.lang.String str49 = mathException48.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str49, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray9, (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray9);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException18);
        java.lang.Class<?> wildcardClass20 = mathException19.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.lang.Class<?> wildcardClass14 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass7 = mathException3.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", throwable1);
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException(throwable1);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str2, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray6 = mathException5.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray9 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        mathException5.addSuppressed((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Throwable[] throwableArray19 = mathException5.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException5);
        java.lang.String str21 = iOException20.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str21, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.lang.Object[] objArray1 = null;
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: ", objArray1, throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", objArray6, (java.lang.Throwable) mathException13);
        java.lang.Class<?> wildcardClass15 = mathException13.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        java.lang.Throwable[] throwableArray14 = mathException12.getSuppressed();
        java.lang.String[] strArray21 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray21, (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray21);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) derivativeException28);
        java.lang.String str30 = derivativeException28.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str30, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.String[] strArray11 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray11);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) derivativeException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException17);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException19);
        java.lang.Class<?> wildcardClass22 = mathException21.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: ");
        java.lang.String str2 = mathException1.getPattern();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str2, "java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException26);
        java.io.IOException iOException28 = new java.io.IOException("", (java.lang.Throwable) mathException26);
        derivativeException23.addSuppressed((java.lang.Throwable) iOException28);
        mathException17.addSuppressed((java.lang.Throwable) iOException28);
        java.lang.String str31 = iOException28.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.io.IOException: " + "'", str31, "java.io.IOException: ");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12, throwable18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12);
        java.lang.Throwable[] throwableArray22 = mathException21.getSuppressed();
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException31);
        java.lang.Object[] objArray33 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", objArray33);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("");
        mathException38.addSuppressed((java.lang.Throwable) mathException41);
        java.io.IOException iOException43 = new java.io.IOException("", (java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", objArray33, (java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) mathException44);
        mathException21.addSuppressed((java.lang.Throwable) mathException44);
        java.lang.Object[] objArray47 = mathException44.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.String str5 = mathException3.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass8 = mathException7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray2 = mathException1.getArguments();
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException1);
        java.lang.String str5 = mathException1.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException("hi!", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        java.lang.Object[] objArray11 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", objArray11);
        java.lang.Throwable[] throwableArray13 = mathException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) mathException12);
        iOException4.addSuppressed((java.lang.Throwable) mathException12);
        java.lang.Class<?> wildcardClass16 = mathException12.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Throwable[] throwableArray15 = derivativeException13.getSuppressed();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray8 = mathException5.getArguments();
        java.lang.String str9 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str9, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) mathException19);
        java.lang.Throwable[] throwableArray21 = mathException19.getSuppressed();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException23);
        java.lang.String str25 = mathException23.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str25, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.io.IOException iOException5 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException14);
        java.lang.Throwable[] throwableArray17 = mathException14.getSuppressed();
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        mathException22.addSuppressed((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException("hi!", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray31 = mathException30.getArguments();
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", objArray31);
        java.lang.String str33 = mathException32.getPattern();
        mathException22.addSuppressed((java.lang.Throwable) mathException32);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) mathException22);
        java.lang.Object[] objArray36 = mathException22.getArguments();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException22);
        java.lang.Class<?> wildcardClass38 = mathException22.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str33, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException7);
        java.lang.Class<?> wildcardClass9 = mathException8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        mathException6.addSuppressed((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException13);
        mathException6.addSuppressed((java.lang.Throwable) mathException13);
        mathException2.addSuppressed((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Class<?> wildcardClass20 = mathException2.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray3);
        java.lang.String str5 = mathException4.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray6);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", throwable10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray6, throwable10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray6);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray7 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        mathException3.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException16);
        java.lang.String str19 = mathException18.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        java.lang.String str5 = mathException4.getPattern();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) mathException4);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: " + "'", str8, "java.io.IOException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) mathException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        java.lang.Class<?> wildcardClass9 = mathException7.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", throwable1);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String[] strArray16 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray16);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", objArray10, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException23);
        java.lang.Throwable[] throwableArray25 = mathException23.getSuppressed();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: " + "'", str9, "java.io.IOException: ");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[org.apache.commons.math.MathException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[org.apache.commons.math.MathException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.Class<?> wildcardClass16 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("hi!", throwable2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException6 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException6);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        java.lang.String str7 = mathException6.getPattern();
        java.lang.Object[] objArray8 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray3, (java.lang.Throwable) mathException6);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) mathException6);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) mathException6);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12, throwable18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray12);
        java.lang.String str24 = derivativeException23.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str24, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray7 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        java.lang.String str10 = derivativeException9.getPattern();
        java.io.IOException iOException14 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException17);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException17);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException25);
        java.lang.Object[] objArray27 = mathException26.getArguments();
        derivativeException7.addSuppressed((java.lang.Throwable) mathException26);
        java.lang.String str29 = mathException26.toString();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.MathException: " + "'", str29, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray13 = mathException11.getSuppressed();
        java.lang.String[] strArray22 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray22);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException("", (java.lang.Throwable) mathException29);
        java.lang.Object[] objArray31 = mathException29.getArguments();
        mathException11.addSuppressed((java.lang.Throwable) mathException29);
        java.lang.Class<?> wildcardClass33 = mathException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Class<?> wildcardClass15 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        mathException3.addSuppressed((java.lang.Throwable) mathException6);
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray12 = mathException11.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", objArray12);
        java.lang.String str14 = mathException13.getPattern();
        mathException3.addSuppressed((java.lang.Throwable) mathException13);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) mathException3);
        java.lang.String str17 = mathException3.toString();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.MathException: " + "'", str17, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.String str4 = derivativeException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str4, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.String str15 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray8);
        java.lang.Throwable[] throwableArray18 = derivativeException17.getSuppressed();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException4);
        java.io.IOException iOException6 = new java.io.IOException("", (java.lang.Throwable) mathException5);
        java.lang.String str7 = mathException5.getPattern();
        java.lang.Object[] objArray8 = mathException5.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        java.lang.Object[] objArray14 = mathException12.getArguments();
        java.io.IOException iOException16 = new java.io.IOException("");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray14, (java.lang.Throwable) iOException16);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", objArray14, (java.lang.Throwable) mathException21);
        java.lang.String str23 = mathException22.getPattern();
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray8, (java.lang.Throwable) mathException22);
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException22);
        java.lang.Throwable throwable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException25.addSuppressed(throwable26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray9);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        java.lang.Throwable[] throwableArray16 = derivativeException14.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) derivativeException14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray6, (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException12);
        java.lang.String str14 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str14, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray5 = mathException2.getArguments();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray5);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException11);
        derivativeException8.addSuppressed((java.lang.Throwable) mathException11);
        java.lang.String str15 = derivativeException8.getPattern();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) mathException17);
        java.lang.Class<?> wildcardClass19 = iOException18.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        java.lang.String str6 = mathException4.getPattern();
        java.lang.Object[] objArray7 = mathException4.getArguments();
        java.io.IOException iOException11 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException14);
        mathException4.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) mathException4);
        java.lang.String str19 = mathException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        java.lang.Throwable[] throwableArray8 = mathException4.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException12);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException12);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.String[] strArray10 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) mathException20);
        java.lang.Throwable[] throwableArray22 = mathException20.getSuppressed();
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray10, (java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException24);
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException25);
        java.lang.String[] strArray36 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray36);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray36);
        java.io.IOException iOException41 = new java.io.IOException("", (java.lang.Throwable) mathException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException40);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) mathException42);
        java.lang.String[] strArray51 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray51, (java.lang.Throwable) derivativeException55);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException60);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("");
        mathException60.addSuppressed((java.lang.Throwable) mathException63);
        java.io.IOException iOException65 = new java.io.IOException("", (java.lang.Throwable) mathException60);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray51, (java.lang.Throwable) iOException65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray51);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray51);
        iOException43.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException27.addSuppressed((java.lang.Throwable) iOException43);
        java.lang.String str71 = iOException43.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str71, "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray4 = mathException3.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException", (java.lang.Throwable) mathException6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        java.lang.Object[] objArray13 = mathException11.getArguments();
        java.lang.Class<?> wildcardClass14 = mathException11.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Object[] objArray3 = mathException1.getArguments();
        java.lang.Object[] objArray4 = mathException1.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException5);
        java.lang.String str7 = mathException6.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray7, (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException14);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("java.io.IOException: ");
        java.lang.Throwable[] throwableArray20 = mathException19.getSuppressed();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) mathException22);
        mathException14.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Class<?> wildcardClass28 = iOException26.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray10);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray10);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray10, throwable16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray10);
        java.lang.String str20 = mathException19.getPattern();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException19);
        java.lang.Class<?> wildcardClass22 = mathException19.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.MathException: " + "'", str20, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        mathException4.addSuppressed((java.lang.Throwable) mathException7);
        java.io.IOException iOException9 = new java.io.IOException("", (java.lang.Throwable) mathException4);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException10);
        java.lang.Object[] objArray13 = mathException12.getArguments();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException12);
        java.lang.String str15 = mathException12.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str15, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray8);
        java.lang.String str15 = mathException14.getPattern();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str15, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        java.io.IOException iOException21 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException23);
        java.lang.String[] strArray33 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray33);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        iOException24.addSuppressed((java.lang.Throwable) derivativeException40);
        java.lang.String str42 = iOException24.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str42, "java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", throwable1);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray9, throwable15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.Class<?> wildcardClass18 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12, throwable18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        java.lang.String str26 = mathException24.getPattern();
        java.io.IOException iOException27 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12, (java.lang.Throwable) iOException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12);
        java.lang.String str31 = mathException30.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str31, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.String[] strArray14 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray14);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray14);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("java.io.IOException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray14);
        java.io.IOException iOException24 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException23);
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException23);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException25);
        java.lang.String str27 = iOException25.toString();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str27, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: ", objArray4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException", objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", objArray17);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("");
        mathException22.addSuppressed((java.lang.Throwable) mathException25);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray17, (java.lang.Throwable) mathException22);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException28);
        derivativeException10.addSuppressed((java.lang.Throwable) mathException28);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str34 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str34, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        java.lang.Throwable[] throwableArray20 = mathException18.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray20);
        java.lang.String str22 = mathException21.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str22, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException3);
        java.io.IOException iOException6 = new java.io.IOException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException3);
        java.lang.String str7 = mathException3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: " + "'", str7, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", objArray7, (java.lang.Throwable) mathException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) derivativeException16);
        java.lang.Class<?> wildcardClass18 = iOException17.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException5);
        java.lang.Object[] objArray7 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", objArray7);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("");
        mathException12.addSuppressed((java.lang.Throwable) mathException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", objArray7, (java.lang.Throwable) mathException12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException23);
        java.lang.Object[] objArray25 = mathException23.getArguments();
        java.lang.Throwable[] throwableArray26 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException30);
        java.lang.String str32 = mathException31.getPattern();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException31);
        mathException20.addSuppressed((java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) mathException31);
        java.lang.Object[] objArray36 = mathException31.getArguments();
        java.lang.String str37 = mathException31.getPattern();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException6);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", objArray8);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("");
        mathException13.addSuppressed((java.lang.Throwable) mathException16);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray8);
        java.lang.Object[] objArray21 = mathException20.getArguments();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray32 = mathException31.getArguments();
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException37);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException37);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("", objArray32, (java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: ", objArray21, (java.lang.Throwable) mathException44);
        java.lang.Class<?> wildcardClass46 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        java.lang.String str2 = mathException1.getPattern();
        java.lang.Object[] objArray3 = mathException1.getArguments();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        java.lang.String str5 = mathException4.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.MathException: " + "'", str5, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray13);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) mathException23);
        java.lang.Throwable[] throwableArray25 = mathException23.getSuppressed();
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) mathException30);
        java.lang.String[] strArray39 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray39);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray39, (java.lang.Throwable) derivativeException43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray39);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) derivativeException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray13, (java.lang.Throwable) iOException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray13);
        java.lang.Object[] objArray50 = mathException49.getArguments();
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException", objArray50);
        java.lang.String str52 = mathException51.toString();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException" + "'", str52, "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("");
        mathException2.addSuppressed((java.lang.Throwable) mathException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) mathException5);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ", strArray6);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.lang.String str12 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException13);
        java.io.IOException iOException16 = new java.io.IOException("hi!", (java.lang.Throwable) mathException15);
        derivativeException5.addSuppressed((java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException5);
        java.lang.String str19 = mathException18.toString();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str19, "org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = mathException5.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException5);
        java.lang.Throwable[] throwableArray8 = mathException5.getSuppressed();
        java.lang.String str9 = mathException5.getPattern();
        java.lang.Throwable[] throwableArray10 = mathException5.getSuppressed();
        java.lang.String str11 = mathException5.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: " + "'", str9, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str11, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.lang.Object[] objArray5 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("", objArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray14, (java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.String str22 = derivativeException7.getPattern();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray6);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray11 = derivativeException9.getArguments();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException12);
        java.lang.Class<?> wildcardClass14 = mathException13.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("java.io.IOException: ", objArray4);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException13);
        java.lang.Object[] objArray15 = mathException14.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException22);
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray4, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException22);
        java.lang.String[] strArray35 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException44);
        java.lang.Object[] objArray46 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("", objArray46);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("");
        mathException51.addSuppressed((java.lang.Throwable) mathException54);
        java.io.IOException iOException56 = new java.io.IOException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", objArray46, (java.lang.Throwable) mathException51);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException57);
        java.io.IOException iOException59 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException58);
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException59);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException63);
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException63);
        iOException60.addSuppressed((java.lang.Throwable) mathException63);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray35, (java.lang.Throwable) iOException60);
        mathException28.addSuppressed((java.lang.Throwable) iOException60);
        java.lang.String str69 = mathException28.getPattern();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "org.apache.commons.math.MathException: " + "'", str69, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray7 = mathException6.getArguments();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException6);
        java.lang.String str9 = mathException8.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str9, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException27);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException34);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", objArray29, (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException36);
        java.io.IOException iOException40 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) mathException36);
        java.lang.Throwable[] throwableArray41 = iOException40.getSuppressed();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Object[]) throwableArray41);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException46);
        java.lang.String str48 = mathException46.getPattern();
        java.io.IOException iOException49 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException46);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray41, (java.lang.Throwable) mathException46);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException53);
        java.io.IOException iOException55 = new java.io.IOException((java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException55);
        java.lang.Throwable[] throwableArray57 = mathException56.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Object[]) throwableArray41, (java.lang.Throwable) derivativeException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException58);
        java.lang.String str61 = derivativeException58.getPattern();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org.apache.commons.math.MathException: " + "'", str61, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException1);
        java.lang.Class<?> wildcardClass4 = mathException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.String[] strArray9 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray9);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("");
        mathException19.addSuppressed((java.lang.Throwable) mathException22);
        java.io.IOException iOException24 = new java.io.IOException("", (java.lang.Throwable) mathException19);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) iOException24);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Object[]) strArray9, (java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.MathException: hi!", strArray9);
        java.lang.Object[] objArray29 = derivativeException28.getArguments();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[org.apache.commons.math.MathException: , hi!]");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: hi!", "org.apache.commons.math.MathException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.String str9 = derivativeException8.getPattern();
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String[] strArray16 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray16, (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray16);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", objArray10, (java.lang.Throwable) derivativeException22);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray10, throwable24);
        java.lang.String str26 = mathException25.getPattern();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException31);
        java.lang.Object[] objArray33 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", objArray33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException34);
        java.lang.Throwable[] throwableArray37 = derivativeException36.getSuppressed();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException39);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException41);
        mathException25.addSuppressed((java.lang.Throwable) mathException41);
        java.lang.Class<?> wildcardClass44 = mathException41.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: " + "'", str9, "java.io.IOException: ");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[org.apache.commons.math.MathException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[org.apache.commons.math.MathException: , org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: hi!, org.apache.commons.math.MathException: ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: " + "'", str26, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException12);
        java.lang.Object[] objArray14 = mathException13.getArguments();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("java.io.IOException: hi!", objArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ");
        java.lang.Object[] objArray18 = mathException17.getArguments();
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException21);
        iOException19.addSuppressed((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: ", objArray14, (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException22);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException22);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException22);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.String str8 = iOException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str8, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray5, (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: java.io.IOException: ", strArray5);
        java.lang.String[] strArray19 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray19);
        java.io.IOException iOException24 = new java.io.IOException("", (java.lang.Throwable) mathException23);
        derivativeException11.addSuppressed((java.lang.Throwable) mathException23);
        java.lang.Class<?> wildcardClass26 = mathException23.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) mathException4);
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) iOException5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        java.lang.Object[] objArray16 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray16);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("");
        mathException21.addSuppressed((java.lang.Throwable) mathException24);
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", objArray16, (java.lang.Throwable) mathException21);
        java.lang.String str28 = mathException21.getPattern();
        java.io.IOException iOException29 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException21);
        java.lang.Throwable[] throwableArray30 = iOException29.getSuppressed();
        derivativeException7.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass33 = iOException32.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
        java.lang.Throwable[] throwableArray3 = mathException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: ", strArray7);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray7, (java.lang.Throwable) derivativeException14);
        java.lang.String str16 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException" + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray12);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray12, throwable18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray12);
        java.lang.Throwable[] throwableArray22 = mathException21.getSuppressed();
        java.lang.String[] strArray34 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray34);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray34);
        java.lang.Throwable throwable40 = null;
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray34, throwable40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException46);
        java.lang.String str48 = mathException46.getPattern();
        java.io.IOException iOException49 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException46);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) strArray34, (java.lang.Throwable) iOException49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: ", strArray34);
        mathException21.addSuppressed((java.lang.Throwable) derivativeException51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) derivativeException51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray8, (java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ", (java.lang.Throwable) derivativeException16);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: " + "'", str18, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: java.io.IOException: ");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray11 = derivativeException8.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray11);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) mathException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) iOException13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", objArray9, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException16);
        java.lang.Object[] objArray20 = mathException16.getArguments();
        java.io.IOException iOException23 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException23);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException26.getSuppressed();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.MathException: hi!", objArray20, (java.lang.Throwable) iOException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException26);
        java.lang.String str30 = mathException29.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: " + "'", str30, "org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { "" };
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", objArray6);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("");
        mathException11.addSuppressed((java.lang.Throwable) mathException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", objArray6, (java.lang.Throwable) mathException11);
        java.lang.String str18 = mathException11.getPattern();
        java.lang.Throwable[] throwableArray19 = mathException11.getSuppressed();
        java.lang.Class<?> wildcardClass20 = mathException11.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str2, "java.io.IOException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray9);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray1, (java.lang.Throwable) mathException14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("java.io.IOException: ", (java.lang.Object[]) strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.MathException: hi!", strArray7);
        java.lang.String str13 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str13, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.MathException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) strArray5, (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray5);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        java.lang.Throwable[] throwableArray13 = derivativeException11.getSuppressed();
        java.lang.String str14 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[org.apache.commons.math.MathException: , hi!]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }
}

